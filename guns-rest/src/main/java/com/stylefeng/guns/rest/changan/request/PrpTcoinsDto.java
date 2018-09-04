package com.stylefeng.guns.rest.changan.request;

/**
 * 长安保险-确认投保请求参数
 * 共保业务相关信息
 * 
 * @author Administrator
 *
 */
public class PrpTcoinsDto {
	/**
	 * 主保单号码
	 */
	private String MainProposalNo;
	/**
	 * 序号（必填）
	 */
	private int SerialNo;
	/**
	 * 共保人机构代码（必填）
	 */
	private String CoinsCode;
	/**
	 * 共保人名称（必填）
	 */
	private String CoinsName;
	/**
	 * 共保类型（必填） 1-我方 2-系统内其他方 3-系统外其他方
	 */
	private String CoinsType;
	/**
	 * 共保份额（必填）
	 */
	private int CoinsRate;
	/**
	 * 是否是首席（必填） 0-否；1-是
	 */
	private String Chiefflag;
	/**
	 * 是否是分出公司（必填） 0-否；1-是
	 */
	private String Coinsflag;
	/**
	 * 币别（必填）
	 */
	private String Currency;
	/**
	 * 保额（必填）
	 */
	private double Coinsamount;
	/**
	 * 保费（必填）
	 */
	private double Coinspremium;
	/**
	 * 手续费/经纪费（必填）
	 */
	private double Agentfee;
	/**
	 * 出单费（必填）
	 */
	private double Operatefee;

	public String getMainProposalNo() {
		return MainProposalNo;
	}

	public void setMainProposalNo(String mainProposalNo) {
		MainProposalNo = mainProposalNo;
	}

	public int getSerialNo() {
		return SerialNo;
	}

	public void setSerialNo(int serialNo) {
		SerialNo = serialNo;
	}

	public String getCoinsCode() {
		return CoinsCode;
	}

	public void setCoinsCode(String coinsCode) {
		CoinsCode = coinsCode;
	}

	public String getCoinsName() {
		return CoinsName;
	}

	public void setCoinsName(String coinsName) {
		CoinsName = coinsName;
	}

	public String getCoinsType() {
		return CoinsType;
	}

	public void setCoinsType(String coinsType) {
		CoinsType = coinsType;
	}

	public int getCoinsRate() {
		return CoinsRate;
	}

	public void setCoinsRate(int coinsRate) {
		CoinsRate = coinsRate;
	}

	public String getChiefflag() {
		return Chiefflag;
	}

	public void setChiefflag(String chiefflag) {
		Chiefflag = chiefflag;
	}

	public String getCoinsflag() {
		return Coinsflag;
	}

	public void setCoinsflag(String coinsflag) {
		Coinsflag = coinsflag;
	}

	public String getCurrency() {
		return Currency;
	}

	public void setCurrency(String currency) {
		Currency = currency;
	}

	public double getCoinsamount() {
		return Coinsamount;
	}

	public void setCoinsamount(double coinsamount) {
		Coinsamount = coinsamount;
	}

	public double getCoinspremium() {
		return Coinspremium;
	}

	public void setCoinspremium(double coinspremium) {
		Coinspremium = coinspremium;
	}

	public double getAgentfee() {
		return Agentfee;
	}

	public void setAgentfee(double agentfee) {
		Agentfee = agentfee;
	}

	public double getOperatefee() {
		return Operatefee;
	}

	public void setOperatefee(double operatefee) {
		Operatefee = operatefee;
	}

}
