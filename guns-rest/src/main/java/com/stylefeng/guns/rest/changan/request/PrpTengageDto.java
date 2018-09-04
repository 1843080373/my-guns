package com.stylefeng.guns.rest.changan.request;

/**
 * 长安保险-确认投保请求参数 
 * 特别约定
 * 
 * @author Administrator
 *
 */
public class PrpTengageDto {
	/**
	 * 险别序号（必填）
	 */
	private String RiskCode;
	/**
	 * 序号（必填） 每条特别约定条款序号相同，不同条款序号从1递增
	 */
	private int SerialNo;
	/**
	 * 行序号（必填） 每条特别约定条款中从1依次递增
	 */
	private int LineNo;
	/**
	 * 条款编码（必填） 条款代码多于4
	 */
	private String ClauseCode;
	/**
	 * 条款文字描述（必填）
	 */
	private String Clauses;
	/**
	 * 标题标志（必填） 0：标题；1：内容
	 */
	private String TitleFlag;
	/**
	 * 标志字段
	 */
	private String Flag;

	public String getRiskCode() {
		return RiskCode;
	}

	public void setRiskCode(String riskCode) {
		RiskCode = riskCode;
	}

	public int getSerialNo() {
		return SerialNo;
	}

	public void setSerialNo(int serialNo) {
		SerialNo = serialNo;
	}

	public int getLineNo() {
		return LineNo;
	}

	public void setLineNo(int lineNo) {
		LineNo = lineNo;
	}

	public String getClauseCode() {
		return ClauseCode;
	}

	public void setClauseCode(String clauseCode) {
		ClauseCode = clauseCode;
	}

	public String getClauses() {
		return Clauses;
	}

	public void setClauses(String clauses) {
		Clauses = clauses;
	}

	public String getTitleFlag() {
		return TitleFlag;
	}

	public void setTitleFlag(String titleFlag) {
		TitleFlag = titleFlag;
	}

	public String getFlag() {
		return Flag;
	}

	public void setFlag(String flag) {
		Flag = flag;
	}

}
