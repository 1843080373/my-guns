package com.stylefeng.guns.insurance;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.stylefeng.guns.insurance.vo.OrderUnderwritAppliInfo;
import com.stylefeng.guns.insurance.vo.OrderUnderwritBeneficiary;
import com.stylefeng.guns.insurance.vo.OrderUnderwritBody;
import com.stylefeng.guns.insurance.vo.OrderUnderwritContactInfo;
import com.stylefeng.guns.insurance.vo.OrderUnderwritHeader;
import com.stylefeng.guns.insurance.vo.OrderUnderwritInsured;
import com.stylefeng.guns.insurance.vo.ResponseObject;
import com.stylefeng.guns.insurance.vo.UnderwritResponse;
import com.stylefeng.guns.jwt.HttpUtils;

/**
 * 下单测试
 * @author Administrator
 *
 */
public class InsuranceInterfaceTest {
	 /**
	 * 下单UAT
	 */
	private final static String underwrit_url = "http://chananel-uat.zhufengic.com:8080/order/api/order/underwrit";
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		/**
		 * 请求头
		 */
	   OrderUnderwritHeader orderUnderwritHeader=
				new OrderUnderwritHeader().setChalCode("")
										  .setPlanCode("")
										  .setProductCode("");
	   Map<String,Object> heads =BeanUtils.objectToMap(orderUnderwritHeader);
	   System.err.println(JSONObject.toJSON(heads));
	   /**
		 * 投保人信息
		 */
		OrderUnderwritAppliInfo appliInfo=
				new OrderUnderwritAppliInfo()
				.setAppliName("")
				.setIdentifyType("")
				.setIdentifyNumber("")
				.setSex("")
				.setBirthDate("")
				.setApplicantType("")
				.setWorkUnit("")
				.setAddress("")
				.setPostCode("");
		/**
		 * 联系人信息
		 */
		OrderUnderwritContactInfo contactInfo=
				new OrderUnderwritContactInfo()
				.setContactName("")
				.setContactIdentifyType("")
				.setContactIdentifyNumber("")
				.setMobileNumber("")
				.setWorkUnit("")
				.setAddress("")
				.setPostCode("");
		/**
		 * 被保险人信息
		 */
		List<OrderUnderwritInsured> insuredList=
				Arrays.asList(
						new OrderUnderwritInsured()
						.setSerialNo("")
						.setInsuredName("")
						.setInsuredAddress("")
						.setIdentifyType("")
						.setIdentifyNumber("")
						.setSex("")
						.setBirthDate("")
						.setMobileNumber("")
						.setPostCode("")
						.setAppliRelation("")
					);
		/**
		 * 受益人信息
		 */
		List<OrderUnderwritBeneficiary> beneficiaryList=
				Arrays.asList(
						new OrderUnderwritBeneficiary()
						.setRelateSerialNo("")
						.setBeneficiaryName("")
						.setIdentifyType("")
						.setIdentifyNumber("")
						.setSex("")
						.setBirthDate("")
						.setMobileNumber("")
						.setRelateSerialNo("")
						);
	   
	   /**
		 * 请求体
		 *      {
					"appliInfo": {
						"address": "",
						"appliName": "",
						"applicantType": "",
						"birthDate": "",
						"identifyNumber": "",
						"identifyType": "",
						"postCode": "",
						"sex": "",
						"workUnit": ""
					},
					"beneficiaryList": [{
						"beneficiaryName": "",
						"birthDate": "",
						"identifyNumber": "",
						"identifyType": "",
						"mobileNumber": "",
						"relateSerialNo": "",
						"sex": ""
					}],
					"businessNo": "",
					"contactInfo": {
						"address": "",
						"contactIdentifyNumber": "",
						"contactIdentifyType": "",
						"contactName": "",
						"mobileNumber": "",
						"postCode": "",
						"workUnit": ""
					},
					"endDate": "",
					"insuredList": [{
						"appliRelation": "",
						"birthDate": "",
						"identifyNumber": "",
						"identifyType": "",
						"insuredAddress": "",
						"insuredName": "",
						"mobileNumber": "",
						"postCode": "",
						"serialNo": "",
						"sex": ""
					}],
					"quantity": "",
					"startDate": "",
					"uwCount": ""
				}
		 */
	   OrderUnderwritBody setBenefitRate=
			   new OrderUnderwritBody()
			   .setBusinessNo("")
			   .setStartDate("")
			   .setEndDate("")			   
			   .setUwCount("")
			   .setQuantity("")
			   .setAppliInfo(appliInfo)
			   .setContactInfo(contactInfo)
			   .setInsuredList(insuredList)
			   .setBeneficiaryList(beneficiaryList);
	   String response = HttpUtils.httpPostWithJson(JSONObject.toJSONString(setBenefitRate), underwrit_url,heads);
	   ResponseObject<UnderwritResponse> underwritResponse = (ResponseObject<UnderwritResponse>) JSONObject.parse(response);
	   /**
	    * {
			  "state": 200,
			  "msg": "OK",
			  "data": {
			    "proposalNo": null,
			    "sumPrm": "30.00",
			    "platOrderNo": "C20180428101007693100203342",
			    "chalOrderNo": "17111602132400422181",
			    "underwriteInd": "6",
			    "policyNo": "C001010111620180000005"
			  }
			}
	    */
	   System.out.println("下单响应："+JSONObject.toJSONString(underwritResponse));
	}
}
