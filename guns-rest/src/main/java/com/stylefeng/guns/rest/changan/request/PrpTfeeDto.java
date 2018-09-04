package com.stylefeng.guns.rest.changan.request;

/**
 * 长安保险-确认投保请求参数
 * 保额保费信息
 * @author Administrator
 *
 */
public class PrpTfeeDto {
	/**
	 * 险种代码
	 */
	private String RiskCode;
	/**
	 * 币别 参见代码
	 */
	private String Currency;
	/**
	 * 总保额
	 */
	private double Amount;
	/**
	 * 总保费
	 */
	private double Premium;
	/**
	 * 币别1
	 */
	private String Currency1;
	/**
	 * 汇率1
	 */
	private double ExchangeRate1;
	/**
	 * 总保额1
	 */
	private double Amount1;
	/**
	 * 总保费1
	 */
	private double Premium1;
	/**
	 * 币别2
	 */
	private String Currency2;
	/**
	 * 汇率2
	 */
	private double ExchangeRate2;
	/**
	 * 总保额2
	 */
	private double Amount2;
	/**
	 * 总保费2
	 */
	private double Premium2;
	public String getRiskCode() {
		return RiskCode;
	}
	public void setRiskCode(String riskCode) {
		RiskCode = riskCode;
	}
	public String getCurrency() {
		return Currency;
	}
	public void setCurrency(String currency) {
		Currency = currency;
	}
	public double getAmount() {
		return Amount;
	}
	public void setAmount(double amount) {
		Amount = amount;
	}
	public double getPremium() {
		return Premium;
	}
	public void setPremium(double premium) {
		Premium = premium;
	}
	public String getCurrency1() {
		return Currency1;
	}
	public void setCurrency1(String currency1) {
		Currency1 = currency1;
	}
	public double getExchangeRate1() {
		return ExchangeRate1;
	}
	public void setExchangeRate1(double exchangeRate1) {
		ExchangeRate1 = exchangeRate1;
	}
	public double getAmount1() {
		return Amount1;
	}
	public void setAmount1(double amount1) {
		Amount1 = amount1;
	}
	public double getPremium1() {
		return Premium1;
	}
	public void setPremium1(double premium1) {
		Premium1 = premium1;
	}
	public String getCurrency2() {
		return Currency2;
	}
	public void setCurrency2(String currency2) {
		Currency2 = currency2;
	}
	public double getExchangeRate2() {
		return ExchangeRate2;
	}
	public void setExchangeRate2(double exchangeRate2) {
		ExchangeRate2 = exchangeRate2;
	}
	public double getAmount2() {
		return Amount2;
	}
	public void setAmount2(double amount2) {
		Amount2 = amount2;
	}
	public double getPremium2() {
		return Premium2;
	}
	public void setPremium2(double premium2) {
		Premium2 = premium2;
	}
}
