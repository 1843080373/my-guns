package com.stylefeng.guns.insurance.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 投保接口 Body VO
 * 客户在完成投保信息填写后，提交给第三方渠道平台由第三方渠道转发至渠道平台中完成投保业务。
 * @author Administrator
 *
 */
public class OrderUnderwritBody implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 渠道方业务号
	 */
	private String businessNo;
	/**
	 * 起保时间
	 */
	private String startDate;
	/**
	 * 终保时间
	 */
	private String endDate;
	/**
	 * 投保份数
	 */
	private String uwCount;
	/**
	 * 投保人数
	 */
	private String quantity;
	/**
	 * 投保人信息
	 */
	private OrderUnderwritAppliInfo appliInfo;
	/**
	 * 联系人信息
	 */
	private OrderUnderwritContactInfo contactInfo;
	/**
	 * 被保险人信息
	 */
	private List<OrderUnderwritInsured> insuredList;
	/**
	 * 受益人信息
	 */
	private List<OrderUnderwritBeneficiary> beneficiaryList;
	public String getBusinessNo() {
		return businessNo;
	}
	public OrderUnderwritBody setBusinessNo(String businessNo) {
		this.businessNo = businessNo;
		return this;
	}
	public String getStartDate() {
		return startDate;
	}
	public OrderUnderwritBody setStartDate(String startDate) {
		this.startDate = startDate;
		return this;
	}
	public String getEndDate() {
		return endDate;
	}
	public OrderUnderwritBody setEndDate(String endDate) {
		this.endDate = endDate;
		return this;
	}
	public String getUwCount() {
		return uwCount;
	}
	public OrderUnderwritBody setUwCount(String uwCount) {
		this.uwCount = uwCount;
		return this;
	}
	public String getQuantity() {
		return quantity;
	}
	public OrderUnderwritBody setQuantity(String quantity) {
		this.quantity = quantity;
		return this;
	}
	public OrderUnderwritAppliInfo getAppliInfo() {
		return appliInfo;
	}
	public OrderUnderwritBody setAppliInfo(OrderUnderwritAppliInfo appliInfo) {
		this.appliInfo = appliInfo;
		return this;
	}
	public OrderUnderwritContactInfo getContactInfo() {
		return contactInfo;
	}
	public OrderUnderwritBody setContactInfo(OrderUnderwritContactInfo contactInfo) {
		this.contactInfo = contactInfo;
		return this;
	}
	public List<OrderUnderwritInsured> getInsuredList() {
		return insuredList;
	}
	public OrderUnderwritBody setInsuredList(List<OrderUnderwritInsured> insuredList) {
		this.insuredList = insuredList;
		return this;
	}
	public List<OrderUnderwritBeneficiary> getBeneficiaryList() {
		return beneficiaryList;
	}
	public OrderUnderwritBody setBeneficiaryList(List<OrderUnderwritBeneficiary> beneficiaryList) {
		this.beneficiaryList = beneficiaryList;
		return this;
	}
	
	
}
