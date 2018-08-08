package com.stylefeng.guns.insurance.vo;

import java.io.Serializable;

/**
 * 投保接口 Header VO
 * 客户在完成投保信息填写后，提交给第三方渠道平台由第三方渠道转发至渠道平台中完成投保业务。
 * @author Administrator
 *
 */
public class OrderUnderwritHeader implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 渠道编码
	 */
	private String chalCode;
	/**
	 * 渠道用户编码
	 */
	private String userCode;
	/**
	 * 产品编码
	 */
	private String productCode;
	/**
	 * 方案编码
	 */
	private String planCode;
	public String getChalCode() {
		return chalCode;
	}
	public OrderUnderwritHeader setChalCode(String chalCode) {
		this.chalCode = chalCode;
		return this;
	}
	public String getUserCode() {
		return userCode;
	}
	public OrderUnderwritHeader setUserCode(String userCode) {
		this.userCode = userCode;
		return this;
	}
	public String getProductCode() {
		return productCode;
	}
	public OrderUnderwritHeader setProductCode(String productCode) {
		this.productCode = productCode;
		return this;
	}
	public String getPlanCode() {
		return planCode;
	}
	public OrderUnderwritHeader setPlanCode(String planCode) {
		this.planCode = planCode;
		return this;
	}	
}
