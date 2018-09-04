package com.stylefeng.guns.rest.changan.response;

/**
 * 长安保险-确认投保响应参数
 * 接口响应描述
 * @author Administrator
 *
 */
public class ReturnMessageDto {
	/**
	 * 接口类型代码
	 * 固定返回:00
	 */
	private String RequestType;
	/**
	 * 0:失败;1:成功;2：交易流水号重复交易
	 */
	private String ResponseCode;
	/**
	 * 错误说明
	 */
	private String ErrorMessage;
	
	public String getRequestType() {
		return RequestType;
	}
	public void setRequestType(String requestType) {
		RequestType = requestType;
	}
	public String getResponseCode() {
		return ResponseCode;
	}
	public void setResponseCode(String responseCode) {
		ResponseCode = responseCode;
	}
	public String getErrorMessage() {
		return ErrorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		ErrorMessage = errorMessage;
	}
	public Boolean getIsSuccess() {
		return "1".equals(this.ResponseCode);
	}
}
