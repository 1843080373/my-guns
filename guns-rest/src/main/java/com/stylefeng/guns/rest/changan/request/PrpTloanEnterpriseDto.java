package com.stylefeng.guns.rest.changan.request;

/**
 * 长安保险-确认投保请求参数 投保人企业信息
 * 
 * @author Administrator
 *
 */
public class PrpTloanEnterpriseDto {
	/**
	 * 险种代码
	 */
	private String RiskCode;
	/**
	 * 企业类型（必填）
	 */
	private String EnterpriseType;
	/**
	 * 所属行业一级代码（必填）
	 */
	private String BusinessSource;
	/**
	 * 所属行业二级代码（必填）
	 */
	private String ExtensionCode2;
	/**
	 * 所属行业三级代码（必填）
	 */
	private String ExtensionCode3;
	/**
	 * 法定代表人（必填）
	 */
	private String LegalPerson;
	/**
	 * 法定代表人身份证号（必填）
	 */
	private String LegalPersonIDNumber;
	/**
	 * 企业住所
	 */
	private String DetailedBusinessAddress;
	/**
	 * 联系电话（必填）
	 */
	private String BusinessPhone;
	/**
	 * 注册资本（万元）
	 */
	private double RegisteredCapital;
	/**
	 * 工商注册登记号
	 */
	private String OrganizeCode;
	/**
	 * 工商注册登记日期
	 * YYYY-MM-DD
	 */
	private String RegisterDate;
	/**
	 * 上年度营业收入（万元）
	 */
	private double LastYearSales;
	/**
	 * 上年度发卡金额（万元）
	 */
	private double LastyearCard;
	/**
	 * 上年末预收资金金额（万元）
	 */
	private double LastyearAdvan;
	public String getRiskCode() {
		return RiskCode;
	}
	public void setRiskCode(String riskCode) {
		RiskCode = riskCode;
	}
	public String getEnterpriseType() {
		return EnterpriseType;
	}
	public void setEnterpriseType(String enterpriseType) {
		EnterpriseType = enterpriseType;
	}
	public String getBusinessSource() {
		return BusinessSource;
	}
	public void setBusinessSource(String businessSource) {
		BusinessSource = businessSource;
	}
	public String getExtensionCode2() {
		return ExtensionCode2;
	}
	public void setExtensionCode2(String extensionCode2) {
		ExtensionCode2 = extensionCode2;
	}
	public String getExtensionCode3() {
		return ExtensionCode3;
	}
	public void setExtensionCode3(String extensionCode3) {
		ExtensionCode3 = extensionCode3;
	}
	public String getLegalPerson() {
		return LegalPerson;
	}
	public void setLegalPerson(String legalPerson) {
		LegalPerson = legalPerson;
	}
	public String getLegalPersonIDNumber() {
		return LegalPersonIDNumber;
	}
	public void setLegalPersonIDNumber(String legalPersonIDNumber) {
		LegalPersonIDNumber = legalPersonIDNumber;
	}
	public String getDetailedBusinessAddress() {
		return DetailedBusinessAddress;
	}
	public void setDetailedBusinessAddress(String detailedBusinessAddress) {
		DetailedBusinessAddress = detailedBusinessAddress;
	}
	public String getBusinessPhone() {
		return BusinessPhone;
	}
	public void setBusinessPhone(String businessPhone) {
		BusinessPhone = businessPhone;
	}
	public double getRegisteredCapital() {
		return RegisteredCapital;
	}
	public void setRegisteredCapital(double registeredCapital) {
		RegisteredCapital = registeredCapital;
	}
	public String getOrganizeCode() {
		return OrganizeCode;
	}
	public void setOrganizeCode(String organizeCode) {
		OrganizeCode = organizeCode;
	}
	public String getRegisterDate() {
		return RegisterDate;
	}
	public void setRegisterDate(String registerDate) {
		RegisterDate = registerDate;
	}
	public double getLastYearSales() {
		return LastYearSales;
	}
	public void setLastYearSales(double lastYearSales) {
		LastYearSales = lastYearSales;
	}
	public double getLastyearCard() {
		return LastyearCard;
	}
	public void setLastyearCard(double lastyearCard) {
		LastyearCard = lastyearCard;
	}
	public double getLastyearAdvan() {
		return LastyearAdvan;
	}
	public void setLastyearAdvan(double lastyearAdvan) {
		LastyearAdvan = lastyearAdvan;
	}
	
}
