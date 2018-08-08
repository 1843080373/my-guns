package com.stylefeng.guns.insurance.vo;

import java.io.Serializable;

/**
 * 受益人信息 VO
 * 客户在完成投保信息填写后，提交给第三方渠道平台由第三方渠道转发至渠道平台中完成投保业务。
 * @author Administrator
 *
 */
public class OrderUnderwritBeneficiary implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 关联被保险人序号
	 */
	private String relateSerialNo;
	/**
	 * 投保人名称
	 */
	private String beneficiaryName;
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
	 * 受益比例
	 */
	private String benefitRate;
	public String getRelateSerialNo() {
		return relateSerialNo;
	}
	public OrderUnderwritBeneficiary setRelateSerialNo(String relateSerialNo) {
		this.relateSerialNo = relateSerialNo;
		return this;
	}
	public String getBeneficiaryName() {
		return beneficiaryName;
	}
	public OrderUnderwritBeneficiary setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
		return this;
	}
	public String getIdentifyType() {
		return identifyType;
	}
	public OrderUnderwritBeneficiary setIdentifyType(String identifyType) {
		this.identifyType = identifyType;
		return this;
	}
	public String getIdentifyNumber() {
		return identifyNumber;
	}
	public OrderUnderwritBeneficiary setIdentifyNumber(String identifyNumber) {
		this.identifyNumber = identifyNumber;
		return this;
	}
	public String getSex() {
		return sex;
	}
	public OrderUnderwritBeneficiary setSex(String sex) {
		this.sex = sex;
		return this;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public OrderUnderwritBeneficiary setBirthDate(String birthDate) {
		this.birthDate = birthDate;
		return this;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public OrderUnderwritBeneficiary setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
		return this;
	}
	public String getBenefitRate() {
		return benefitRate;
	}
	public OrderUnderwritBeneficiary setBenefitRate(String benefitRate) {
		this.benefitRate = benefitRate;
		return this;
	}
	
}
