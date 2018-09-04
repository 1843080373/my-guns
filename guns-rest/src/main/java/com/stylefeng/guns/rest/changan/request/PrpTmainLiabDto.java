package com.stylefeng.guns.rest.changan.request;

/**
 * 长安保险-确认投保请求参数 
 * 企业信息 
 * 此对象1560险种对接第三方专用
 * 
 * @author Administrator
 *
 */
public class PrpTmainLiabDto {
	/**
	 * 险种代码
	 */
	private String RiskCode;
	/**
	 * 车辆营运证编号（必填）
	 * 无值时传空节点
	 */
	private String CertificateNo;
	/**
	 * 道路运输经营许可证有效期至（必填）
	 * 无值时传空节点
	 */
	private String CertificateDate;
	/**
	 * 车辆归属区域（省）（必填）
	 * 无值时传空节点
	 */
	private String CertificateDepart;
	/**
	 * 经营类型（必填）
	 * 见代码定义
	 */
	private String BusinessCode;
	/**
	 * 被保险人企业类型
	 */
	private String BusinessDetail;
	/**
	 * 道路运输经营许可证编号（必填）
	 * 无值时传空节点
	 */
	private String BusinessSite;
	/**
	 * 运输地域范围（必填）
	 * 无值时传空节点
	 */
	private String InsureArea;
	/**
	 * 企业性质（必填）
	 * 见代码定义
	 */
	private String OfficeType;
	/**
	 * 投保乘客座位总数（必填）
	 * 无值时传空节点
	 */
	private String StaffCount;
	/**
	 * 投保车辆总数（必填）
	 * 无值时传空节点
	 */
	private String PreturnOver;
	/**
	 * 司乘人员总数（必填）
	 * 无值时传空节点
	 */
	private String NowturnOver;
	/**
	 * 车辆归属区域（区）（必填）
	 * 无值时传空节点
	 */
	private String Remark;
	/**
	 * 车辆归属区域（市）（必填）
	 * 无值时传空节点
	 */
	private String BusinessSource;
	public String getRiskCode() {
		return RiskCode;
	}
	public void setRiskCode(String riskCode) {
		RiskCode = riskCode;
	}
	public String getCertificateNo() {
		return CertificateNo;
	}
	public void setCertificateNo(String certificateNo) {
		CertificateNo = certificateNo;
	}
	public String getCertificateDate() {
		return CertificateDate;
	}
	public void setCertificateDate(String certificateDate) {
		CertificateDate = certificateDate;
	}
	public String getCertificateDepart() {
		return CertificateDepart;
	}
	public void setCertificateDepart(String certificateDepart) {
		CertificateDepart = certificateDepart;
	}
	public String getBusinessCode() {
		return BusinessCode;
	}
	public void setBusinessCode(String businessCode) {
		BusinessCode = businessCode;
	}
	public String getBusinessDetail() {
		return BusinessDetail;
	}
	public void setBusinessDetail(String businessDetail) {
		BusinessDetail = businessDetail;
	}
	public String getBusinessSite() {
		return BusinessSite;
	}
	public void setBusinessSite(String businessSite) {
		BusinessSite = businessSite;
	}
	public String getInsureArea() {
		return InsureArea;
	}
	public void setInsureArea(String insureArea) {
		InsureArea = insureArea;
	}
	public String getOfficeType() {
		return OfficeType;
	}
	public void setOfficeType(String officeType) {
		OfficeType = officeType;
	}
	public String getStaffCount() {
		return StaffCount;
	}
	public void setStaffCount(String staffCount) {
		StaffCount = staffCount;
	}
	public String getPreturnOver() {
		return PreturnOver;
	}
	public void setPreturnOver(String preturnOver) {
		PreturnOver = preturnOver;
	}
	public String getNowturnOver() {
		return NowturnOver;
	}
	public void setNowturnOver(String nowturnOver) {
		NowturnOver = nowturnOver;
	}
	public String getRemark() {
		return Remark;
	}
	public void setRemark(String remark) {
		Remark = remark;
	}
	public String getBusinessSource() {
		return BusinessSource;
	}
	public void setBusinessSource(String businessSource) {
		BusinessSource = businessSource;
	}
}
