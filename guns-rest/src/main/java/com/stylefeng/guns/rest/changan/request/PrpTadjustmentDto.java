package com.stylefeng.guns.rest.changan.request;

/**
 * 长安保险-确认投保请求参数
 * 调整系数信息
 * 此对象1560险种对接第三方专用
 * @author Administrator
 *
 */
public class PrpTadjustmentDto {
	/**
	 * 险种代码（必填）
	 */
	private String RiskCode;
	/**
	 * 企业安全标准化等级调整系数
	 */
	private String Riskadjust;
	/**
	 * 上年度标准赔付率调整系数
	 */
	private String Lossratioadjust;
	/**
	 * 续保调整系数
	 */
	private String Renewaladjust;
	/**
	 * 投保座位数调整系数
	 */
	private String Insuredseatadjust;
	/**
	 * 经营范围调整系数
	 */
	private String Businessclassadjust;
	/**
	 * 第三者每人责任限额调整系数
	 */
	private String Limitadjust;
	/**
	 * 责任限额调整系数
	 */
	private String Amountadjust;
	public String getRiskCode() {
		return RiskCode;
	}
	public void setRiskCode(String riskCode) {
		RiskCode = riskCode;
	}
	public String getRiskadjust() {
		return Riskadjust;
	}
	public void setRiskadjust(String riskadjust) {
		Riskadjust = riskadjust;
	}
	public String getLossratioadjust() {
		return Lossratioadjust;
	}
	public void setLossratioadjust(String lossratioadjust) {
		Lossratioadjust = lossratioadjust;
	}
	public String getRenewaladjust() {
		return Renewaladjust;
	}
	public void setRenewaladjust(String renewaladjust) {
		Renewaladjust = renewaladjust;
	}
	public String getInsuredseatadjust() {
		return Insuredseatadjust;
	}
	public void setInsuredseatadjust(String insuredseatadjust) {
		Insuredseatadjust = insuredseatadjust;
	}
	public String getBusinessclassadjust() {
		return Businessclassadjust;
	}
	public void setBusinessclassadjust(String businessclassadjust) {
		Businessclassadjust = businessclassadjust;
	}
	public String getLimitadjust() {
		return Limitadjust;
	}
	public void setLimitadjust(String limitadjust) {
		Limitadjust = limitadjust;
	}
	public String getAmountadjust() {
		return Amountadjust;
	}
	public void setAmountadjust(String amountadjust) {
		Amountadjust = amountadjust;
	}
}
