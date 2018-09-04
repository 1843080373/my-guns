package com.stylefeng.guns.rest.changan.response;

/**
 * 长安保险-确认投保响应参数
 * @author Administrator
 *
 */
public class AffirmPropsalResultDto {
	/**
	 * 业务号（保单号/投保单号） 交易成功,或者交易流水号重复交易，实时支付时返回投保单号
	 */
	private String CertiNo;
	/**
	 * 电子保单下载地址 根据具体业务要求返回
	 */
	private String Epolicy;
	/**
	 * 起保日期，精确到天
	 */
	private String StartDate;
	/**
	 * 起保小时
	 */
	private int StartHour;
	/**
	 * 终保日期，精确到天
	 */
	private String EndDate;
	/**
	 * 终保小时
	 */
	private int EndHour;
	/**
	 * 总保险金额
	 */
	private double SumAmount;
	/**
	 * 总保险费
	 */
	private double SumPremium;
	/**
	 * 总保险费
	 */
	private ReturnMessageDto ReturnMessageDto;
	public String getCertiNo() {
		return CertiNo;
	}
	public void setCertiNo(String certiNo) {
		CertiNo = certiNo;
	}
	public String getEpolicy() {
		return Epolicy;
	}
	public void setEpolicy(String epolicy) {
		Epolicy = epolicy;
	}
	public String getStartDate() {
		return StartDate;
	}
	public void setStartDate(String startDate) {
		StartDate = startDate;
	}
	public int getStartHour() {
		return StartHour;
	}
	public void setStartHour(int startHour) {
		StartHour = startHour;
	}
	public String getEndDate() {
		return EndDate;
	}
	public void setEndDate(String endDate) {
		EndDate = endDate;
	}
	public int getEndHour() {
		return EndHour;
	}
	public void setEndHour(int endHour) {
		EndHour = endHour;
	}
	public double getSumAmount() {
		return SumAmount;
	}
	public void setSumAmount(double sumAmount) {
		SumAmount = sumAmount;
	}
	public double getSumPremium() {
		return SumPremium;
	}
	public void setSumPremium(double sumPremium) {
		SumPremium = sumPremium;
	}
	public ReturnMessageDto getReturnMessageDto() {
		return ReturnMessageDto;
	}
	public void setReturnMessageDto(ReturnMessageDto returnMessageDto) {
		ReturnMessageDto = returnMessageDto;
	}
	
	
}
