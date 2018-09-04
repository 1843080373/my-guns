package com.stylefeng.guns.rest.changan.request;

/**
 * 长安保险-确认投保请求参数
 * 投保对象信息
 * @author Administrator
 *
 */
public class HeadVO {

	/**
	 * 投单号（必填）
	 * 碎屏险对接-盘算时，此字段必传
	 */
	private String ProposalNo;
	/**
	 * 保单号（必填）
	 * 碎屏险对接-盘算时，此字段必传
	 */
	private String PolicyNo;
	/**
	 * 出单来源（必填）
	 * 根据实际情况提供
	 */
	private String SourceType;
	/**
	 *  请求类型（必填）
	 *  （康存必传）投保：T1001；变更关系人：P1001
	 */
	private String RequestType;
	public String getProposalNo() {
		return ProposalNo;
	}
	public void setProposalNo(String proposalNo) {
		ProposalNo = proposalNo;
	}
	public String getPolicyNo() {
		return PolicyNo;
	}
	public void setPolicyNo(String policyNo) {
		PolicyNo = policyNo;
	}
	public String getSourceType() {
		return SourceType;
	}
	public void setSourceType(String sourceType) {
		SourceType = sourceType;
	}
	public String getRequestType() {
		return RequestType;
	}
	public void setRequestType(String requestType) {
		RequestType = requestType;
	}
	
}
