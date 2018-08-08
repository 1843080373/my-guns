package com.stylefeng.guns.insurance.vo;

import java.io.Serializable;

/**
 * 投保人信息 VO
 * 客户在完成投保信息填写后，提交给第三方渠道平台由第三方渠道转发至渠道平台中完成投保业务。
 * @author Administrator
 *
 */
public class OrderUnderwritAppliInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 投保人名称
	 */
	private String appliName;
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
	 * 投保人类型
	 */
	private String applicantType;
	/**
	 * 工作单位
	 */
	private String workUnit;
	/**
	 * 联系地址
	 */
	private String address;
	/**
	 * 邮政编码
	 */
	private String postCode;
	public String getAppliName() {
		return appliName;
	}
	public OrderUnderwritAppliInfo setAppliName(String appliName) {
		this.appliName = appliName;
		return this;
	}
	public String getIdentifyType() {
		return identifyType;
	}
	public OrderUnderwritAppliInfo setIdentifyType(String identifyType) {
		this.identifyType = identifyType;
		return this;
	}
	public String getIdentifyNumber() {
		return identifyNumber;
	}
	public OrderUnderwritAppliInfo setIdentifyNumber(String identifyNumber) {
		this.identifyNumber = identifyNumber;
		return this;
	}
	public String getSex() {
		return sex;
	}
	public OrderUnderwritAppliInfo setSex(String sex) {
		this.sex = sex;
		return this;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public OrderUnderwritAppliInfo setBirthDate(String birthDate) {
		this.birthDate = birthDate;
		return this;
	}
	public String getApplicantType() {
		return applicantType;
	}
	public OrderUnderwritAppliInfo setApplicantType(String applicantType) {
		this.applicantType = applicantType;
		return this;
	}
	public String getWorkUnit() {
		return workUnit;
	}
	public OrderUnderwritAppliInfo setWorkUnit(String workUnit) {
		this.workUnit = workUnit;
		return this;
	}
	public String getAddress() {
		return address;
	}
	public OrderUnderwritAppliInfo setAddress(String address) {
		this.address = address;
		return this;
	}
	public String getPostCode() {
		return postCode;
	}
	public OrderUnderwritAppliInfo setPostCode(String postCode) {
		this.postCode = postCode;
		return this;
	}
}
