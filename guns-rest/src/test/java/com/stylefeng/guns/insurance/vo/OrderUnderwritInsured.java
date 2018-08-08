package com.stylefeng.guns.insurance.vo;

import java.io.Serializable;

/**
 * 被保险人信息 VO
 * 客户在完成投保信息填写后，提交给第三方渠道平台由第三方渠道转发至渠道平台中完成投保业务。
 * @author Administrator
 *
 */
public class OrderUnderwritInsured implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 序号
	 */
	private String serialNo;
	/**
	 * 被保险人名称
	 */
	private String insuredName;
	/**
	 * 被保险人地址
	 */
	private String insuredAddress;
	/**
	 * 证件类型
	 */
	private String identifyType;
	/**
	 * 证件号码
	 */
	private String identifyNumber;
	/**
	 * 性别
	 */
	private String sex;
	/**
	 * 出生日期
	 */
	private String birthDate;
	/**
	 * 手机号码
	 */
	private String mobileNumber;
	/**
	 * 邮政编码
	 */
	private String postCode;
	/**
	 * 与投保人关系
	 */
	private String appliRelation;
	public String getSerialNo() {
		return serialNo;
	}
	public OrderUnderwritInsured setSerialNo(String serialNo) {
		this.serialNo = serialNo;
		return this;
	}
	public String getInsuredName() {
		return insuredName;
	}
	public OrderUnderwritInsured setInsuredName(String insuredName) {
		this.insuredName = insuredName;
		return this;
	}
	public String getInsuredAddress() {
		return insuredAddress;
	}
	public OrderUnderwritInsured setInsuredAddress(String insuredAddress) {
		this.insuredAddress = insuredAddress;
		return this;
	}
	public String getIdentifyType() {
		return identifyType;
	}
	public OrderUnderwritInsured setIdentifyType(String identifyType) {
		this.identifyType = identifyType;
		return this;
	}
	public String getIdentifyNumber() {
		return identifyNumber;
	}
	public OrderUnderwritInsured setIdentifyNumber(String identifyNumber) {
		this.identifyNumber = identifyNumber;
		return this;
	}
	public String getSex() {
		return sex;
	}
	public OrderUnderwritInsured setSex(String sex) {
		this.sex = sex;
		return this;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public OrderUnderwritInsured setBirthDate(String birthDate) {
		this.birthDate = birthDate;
		return this;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public OrderUnderwritInsured setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
		return this;
	}
	public String getPostCode() {
		return postCode;
	}
	public OrderUnderwritInsured setPostCode(String postCode) {
		this.postCode = postCode;
		return this;
	}
	public String getAppliRelation() {
		return appliRelation;
	}
	public OrderUnderwritInsured setAppliRelation(String appliRelation) {
		this.appliRelation = appliRelation;
		return this;
	}
	
}
