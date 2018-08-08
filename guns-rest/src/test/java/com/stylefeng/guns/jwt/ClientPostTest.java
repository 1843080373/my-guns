package com.stylefeng.guns.jwt;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.stylefeng.guns.core.util.MD5Util;
import com.stylefeng.guns.rest.common.SimpleObject;
import com.stylefeng.guns.rest.modular.auth.converter.BaseTransferEntity;
import com.stylefeng.guns.rest.modular.auth.security.impl.Base64SecurityAction;

import io.jsonwebtoken.ExpiredJwtException;

public class ClientPostTest {
	
    private Long expirationL = 604800L;
    private final static String token_url = "http://localhost:8080/auth?userName=admin&password=admin";
	private final static String rest_url = "http://localhost:8080/hello";
	/**
     * <pre>
     *  验证token是否失效
     *  true:过期   false:没过期
     * </pre>
     */
    public Boolean isTokenExpired(Long expiration,String token) {
        try {
        	if(expiration==null) {
        		 return false;
        	}
        	 Date now=new Date();
            final Date expirationDate = new Date(now.getTime()+expiration);
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:ss:mm");
            System.out.println("expirationDate="+sdf.format(expirationDate));
            System.out.println("now="+sdf.format(now));
            return expirationDate.before(now);
        } catch (ExpiredJwtException expiredJwtException) {
            return true;
        }
    }
   
    
	private void doPost() {
		String salt = "0iqwhi";
		String token = null;
		String expirationStr = RedisUtils.read("expiration");
		System.out.println("expirationStr="+expirationStr);
		Long expiration = null;
		if(null!=expirationStr&&!"".equals(expirationStr)) {
			expiration = Long.parseLong(expirationStr);
		}
		System.out.println("expiration="+expiration);
		boolean flag = isTokenExpired(expiration,token);
		System.out.println("flag="+flag);
		if(null==expirationStr||flag) {
			String tokenResponse = HttpUtils.httpPostWithJson("", token_url, null);
			System.out.println("tokenResponse="+tokenResponse);
			JSONObject jsonObjectToken=JSONObject.parseObject(tokenResponse);
			if (tokenResponse != null) {
				String expir = String.valueOf(expirationL*1000);
				int expTime = Integer.parseInt(expir);
				RedisUtils.write("expiration",expir,expTime);
				salt = jsonObjectToken.getString("randomKey");
				token = jsonObjectToken.getString("token");
				RedisUtils.write("salt",salt,expTime);
				RedisUtils.write("token",token,expTime);
			}
		}else {
			salt = RedisUtils.read("salt");
			token = RedisUtils.read("token");
		}
		System.out.println("salt="+salt);
		System.out.println("token="+token);
		SimpleObject simpleObject = new SimpleObject();
		simpleObject.setUser("stylefeng");
		simpleObject.setAge(12);
		simpleObject.setName("ffff");
		simpleObject.setTips("code");
		String jsonString = JSON.toJSONString(simpleObject);
		String encode = new Base64SecurityAction().doAction(jsonString);
		String md5 = MD5Util.encrypt(encode + salt);

		BaseTransferEntity baseTransferEntity = new BaseTransferEntity();
		baseTransferEntity.setObject(encode);
		baseTransferEntity.setSign(md5);
        String param=JSON.toJSONString(baseTransferEntity);
		System.out.println("param="+param);
		Map<String,Object> header = new HashMap<String,Object>();
		header.put("Authorization","Bearer "+token);
		String restResponse = HttpUtils.httpPostWithJson(param, rest_url,header);
		System.out.println("restResponse="+restResponse);
	}
	public static void main(String[] args) {
		 new ClientPostTest().doPost();
	}
}
