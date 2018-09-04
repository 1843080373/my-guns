package com.stylefeng.guns.rest.changan.request;

/**
 * 长安保险-确认投保请求参数
 * 缴费计划信息
 * @author Administrator
 *
 */
public class PrpTplanDto {
	/**
	 * 交费次数序号（必填）
	 */
	private int SerialNo;
	/**
	 * 交费期次（必填）
	 */
	private int PayNo;
	/**
	 * 交费原因（必填）
	 */
	private String PayReason;
	/**
	 * 计划交费截止日期（必填）
	 */
	private String PlanDate;
	/**
	 * 币别（必填）
	 */
	private String Currency;
	/**
	 * 应交费金额（必填）
	 */
	private double PlanFee;
	/**
	 * 拖欠金额（必填）
	 */
	private double DelinquentFee;
	/**
	 * 标志字段 不传
	 */
	private String Flag;
	/**
	 * 计划开始日期
	 */
	private String PlanStartDate;
	public int getSerialNo() {
		return SerialNo;
	}
	public void setSerialNo(int serialNo) {
		SerialNo = serialNo;
	}
	public int getPayNo() {
		return PayNo;
	}
	public void setPayNo(int payNo) {
		PayNo = payNo;
	}
	public String getPayReason() {
		return PayReason;
	}
	public void setPayReason(String payReason) {
		PayReason = payReason;
	}
	public String getPlanDate() {
		return PlanDate;
	}
	public void setPlanDate(String planDate) {
		PlanDate = planDate;
	}
	public String getCurrency() {
		return Currency;
	}
	public void setCurrency(String currency) {
		Currency = currency;
	}
	public double getPlanFee() {
		return PlanFee;
	}
	public void setPlanFee(double planFee) {
		PlanFee = planFee;
	}
	public double getDelinquentFee() {
		return DelinquentFee;
	}
	public void setDelinquentFee(double delinquentFee) {
		DelinquentFee = delinquentFee;
	}
	public String getFlag() {
		return Flag;
	}
	public void setFlag(String flag) {
		Flag = flag;
	}
	public String getPlanStartDate() {
		return PlanStartDate;
	}
	public void setPlanStartDate(String planStartDate) {
		PlanStartDate = planStartDate;
	}
	
}
