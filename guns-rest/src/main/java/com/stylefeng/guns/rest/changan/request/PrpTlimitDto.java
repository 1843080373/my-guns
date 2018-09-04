package com.stylefeng.guns.rest.changan.request;

/**
 * 长安保险-确认投保请求参数
 * 限额免赔信息
 * 根据具体业务要求，1557险种时必传
 * @author Administrator
 *
 */
public class PrpTlimitDto {
	/**
	 * 险种代码
	 */
	private String RiskCode;
	/**
	 * 限额/免赔级别   （必填）
	 */
	private String LimitGrade;
	/**
	 * 限额序号（必填）
	 */
	private int LimitNo;
	/**
	 * 赔偿限额/免赔额类别（必填）
	 */
	private String LimitType;
	/**
	 * 币别 参见代码（必填）
	 */
	private String Currency;
	/**
	 * 赔偿限额/免赔额（必填）
	 */
	private double LimitFee;
	/**
	 * 是否参与保费计算标志 （必填）
	 * Y-是；N-否
	 */
	private String CalculateFlag;
	/**
	 * 限额免赔标志（必填）
	 * 1表示免赔额；0表示限额；2表示免赔率
	 */
	private String LimitFlag;
	public String getRiskCode() {
		return RiskCode;
	}
	public void setRiskCode(String riskCode) {
		RiskCode = riskCode;
	}
	public String getLimitGrade() {
		return LimitGrade;
	}
	public void setLimitGrade(String limitGrade) {
		LimitGrade = limitGrade;
	}
	public int getLimitNo() {
		return LimitNo;
	}
	public void setLimitNo(int limitNo) {
		LimitNo = limitNo;
	}
	public String getLimitType() {
		return LimitType;
	}
	public void setLimitType(String limitType) {
		LimitType = limitType;
	}
	public String getCurrency() {
		return Currency;
	}
	public void setCurrency(String currency) {
		Currency = currency;
	}
	public double getLimitFee() {
		return LimitFee;
	}
	public void setLimitFee(double limitFee) {
		LimitFee = limitFee;
	}
	public String getCalculateFlag() {
		return CalculateFlag;
	}
	public void setCalculateFlag(String calculateFlag) {
		CalculateFlag = calculateFlag;
	}
	public String getLimitFlag() {
		return LimitFlag;
	}
	public void setLimitFlag(String limitFlag) {
		LimitFlag = limitFlag;
	}
	
}
