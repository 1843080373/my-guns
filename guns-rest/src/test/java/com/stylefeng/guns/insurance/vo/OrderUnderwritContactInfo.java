package com.stylefeng.guns.insurance.vo;

import java.io.Serializable;

/**
 * 联系人信息 VO
 * 客户在完成投保信息填写后，提交给第三方渠道平台由第三方渠道转发至渠道平台中完成投保业务。
 * @author Administrator
 *
 */
public class OrderUnderwritContactInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 联系人
	 */
	private String contactName;
	/**
	 * 联系人证件类型
	 */
	private String contactIdentifyType;
	/**
	 * 联系人证件号码
	 */
	private String contactIdentifyNumber;
	/**
	 * 联系人电话
	 */
	private String mobileNumber;
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
	public String getContactName() {
		return contactName;
	}
	public OrderUnderwritContactInfo setContactName(String contactName) {
		this.contactName = contactName;
		return this;
	}
	public String getContactIdentifyType() {
		return contactIdentifyType;
	}
	public OrderUnderwritContactInfo setContactIdentifyType(String contactIdentifyType) {
		this.contactIdentifyType = contactIdentifyType;
		return this;
	}
	public String getContactIdentifyNumber() {
		return contactIdentifyNumber;
	}
	public OrderUnderwritContactInfo setContactIdentifyNumber(String contactIdentifyNumber) {
		this.contactIdentifyNumber = contactIdentifyNumber;
		return this;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public OrderUnderwritContactInfo setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
		return this;
	}
	public String getWorkUnit() {
		return workUnit;
	}
	public OrderUnderwritContactInfo setWorkUnit(String workUnit) {
		this.workUnit = workUnit;
		return this;
	}
	public String getAddress() {
		return address;
	}
	public OrderUnderwritContactInfo setAddress(String address) {
		this.address = address;
		return this;
	}
	public String getPostCode() {
		return postCode;
	}
	public OrderUnderwritContactInfo setPostCode(String postCode) {
		this.postCode = postCode;
		return this;
	}
	
}
