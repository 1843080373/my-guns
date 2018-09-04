package com.stylefeng.guns.rest.changan.request;

/**
 * 长安保险-确认投保请求参数
 * 投保基本信息
 * @author Administrator
 *
 */
public class PrpTmainDto {
	/**
	 * 投保单号
	 */
	private String ProposalNo;
	/**
	 * 险种代码（必填）
	 */
	private String RiskCode;
	/**
	 * 参见代码定义（默认普通）
	 */
	private String PolicySort;
	/**
	 * 保单印刷号
	 */
	private String PrintNo;
	/**
	 * 语种标志 
	 * 参见代码定义（默认C-中文）
	 */
	private String Language;
	/**
	 * 投保人名称（必填）
	 */
	private String AppliName;
	/**
	 * 投保人地址
	 */
	private String AppliAddress;
	/**
	 * 被保险人名称（必填）
	 */
	private String InsuredName;
	/**
	 * 被保险人地址
	 */
	private String InsuredAddress;
	/**
	 * 起保日期（必填）
	 * 精确到天
	 */
	private String StartDate;
	/**
	 * 起保小时（必填）
	 */
	private int StartHour;
	/**
	 * 起保分钟
	 */
	private int StartMinute;
	/**
	 * 终保日期（必填）
	 */
	private String EndDate;
	/**
	 * 终保小时（必填）
	 */
	private int EndHour;
	/**
	 * 终保分钟
	 */
	private int EndMinute;
	/**
	 * 净费率
	 */
	private double PureRate;
	/**
	 *手续费比例（必填）
	 */
	private double DisRate;
	/**
	 * 总折扣率（必填）
	 * 无折扣时为0
	 */
	private String Discount;
	
	/**
	 * 币别代码
	 * 参见代码定义（默认人名币）
	 */
	private String Currency;
	/**
	 * 投保人国别
	 * 1-中国（默认）;0-境
	 */
	private String NationFlag;
	/**
	 * 股东业务标识
	 * 0-非股东（默认）；1-股东
	 */
	private String ShareHolderFlag;
	/**
	 * 总保险金额（必填）
	 */
	private double SumAmount;
	/**
	 * 总折扣金额
	 */
	private double SumDiscount;
	/**
	 * 总保险费（必填）
	 */
	private double SumPremium;
	/**
	 * 争议解决方式
	 * 1-诉讼（默认）;2-仲裁
	 */
	private String ArgueSolution;
	/**
	 * 仲裁委员会名称
	 * 争议解决方式为仲裁时，必传
	 */
	private String ArbitBoardName;
	
	/**
	 * 约定分期交费次数（必填）
	 */
	private int PayTimes;
	/**
	 * 联共保标志 （必填）
	 */
	private String CoinsFlag;
	/**
	 * 保单类型
	 * 0-原保单业务；1-共保分入；2-共保分出；3-临分分入；4-临分分出
	 */
	private String PolicySortNew;
	public String getProposalNo() {
		return ProposalNo;
	}
	public void setProposalNo(String proposalNo) {
		ProposalNo = proposalNo;
	}
	public String getRiskCode() {
		return RiskCode;
	}
	public void setRiskCode(String riskCode) {
		RiskCode = riskCode;
	}
	public String getPolicySort() {
		return PolicySort;
	}
	public void setPolicySort(String policySort) {
		PolicySort = policySort;
	}
	public String getPrintNo() {
		return PrintNo;
	}
	public void setPrintNo(String printNo) {
		PrintNo = printNo;
	}
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
	}
	public String getAppliName() {
		return AppliName;
	}
	public void setAppliName(String appliName) {
		AppliName = appliName;
	}
	public String getAppliAddress() {
		return AppliAddress;
	}
	public void setAppliAddress(String appliAddress) {
		AppliAddress = appliAddress;
	}
	public String getInsuredName() {
		return InsuredName;
	}
	public void setInsuredName(String insuredName) {
		InsuredName = insuredName;
	}
	public String getInsuredAddress() {
		return InsuredAddress;
	}
	public void setInsuredAddress(String insuredAddress) {
		InsuredAddress = insuredAddress;
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
	public int getStartMinute() {
		return StartMinute;
	}
	public void setStartMinute(int startMinute) {
		StartMinute = startMinute;
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
	public int getEndMinute() {
		return EndMinute;
	}
	public void setEndMinute(int endMinute) {
		EndMinute = endMinute;
	}
	public double getPureRate() {
		return PureRate;
	}
	public void setPureRate(double pureRate) {
		PureRate = pureRate;
	}
	public double getDisRate() {
		return DisRate;
	}
	public void setDisRate(double disRate) {
		DisRate = disRate;
	}
	public String getDiscount() {
		return Discount;
	}
	public void setDiscount(String discount) {
		Discount = discount;
	}
	public String getCurrency() {
		return Currency;
	}
	public void setCurrency(String currency) {
		Currency = currency;
	}
	public String getNationFlag() {
		return NationFlag;
	}
	public void setNationFlag(String nationFlag) {
		NationFlag = nationFlag;
	}
	public String getShareHolderFlag() {
		return ShareHolderFlag;
	}
	public void setShareHolderFlag(String shareHolderFlag) {
		ShareHolderFlag = shareHolderFlag;
	}
	public double getSumAmount() {
		return SumAmount;
	}
	public void setSumAmount(double sumAmount) {
		SumAmount = sumAmount;
	}
	public double getSumDiscount() {
		return SumDiscount;
	}
	public void setSumDiscount(double sumDiscount) {
		SumDiscount = sumDiscount;
	}
	public double getSumPremium() {
		return SumPremium;
	}
	public void setSumPremium(double sumPremium) {
		SumPremium = sumPremium;
	}
	public String getArgueSolution() {
		return ArgueSolution;
	}
	public void setArgueSolution(String argueSolution) {
		ArgueSolution = argueSolution;
	}
	public String getArbitBoardName() {
		return ArbitBoardName;
	}
	public void setArbitBoardName(String arbitBoardName) {
		ArbitBoardName = arbitBoardName;
	}
	public int getPayTimes() {
		return PayTimes;
	}
	public void setPayTimes(int payTimes) {
		PayTimes = payTimes;
	}
	public String getCoinsFlag() {
		return CoinsFlag;
	}
	public void setCoinsFlag(String coinsFlag) {
		CoinsFlag = coinsFlag;
	}
	public String getPolicySortNew() {
		return PolicySortNew;
	}
	public void setPolicySortNew(String policySortNew) {
		PolicySortNew = policySortNew;
	}
}
