package com.stylefeng.guns.insurance.vo;

import java.io.Serializable;

/**
 * 下单响应
 * @author Administrator
 *
 */
public class UnderwritResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 投保单号
	 */
	private String proposalNo;
	/**
	 * 总保费
	 */
	private String sumPrm;
	/**
	 * 平台订单号
	 */
	private String platOrderNo;
	/**
	 * 渠道订单号
	 */
	private String chalOrderNo;
	/**
	 * 保单号
	 */
	private String policyNo;
	public String getProposalNo() {
		return proposalNo;
	}
	public void setProposalNo(String proposalNo) {
		this.proposalNo = proposalNo;
	}
	public String getSumPrm() {
		return sumPrm;
	}
	public void setSumPrm(String sumPrm) {
		this.sumPrm = sumPrm;
	}
	public String getPlatOrderNo() {
		return platOrderNo;
	}
	public void setPlatOrderNo(String platOrderNo) {
		this.platOrderNo = platOrderNo;
	}
	public String getChalOrderNo() {
		return chalOrderNo;
	}
	public void setChalOrderNo(String chalOrderNo) {
		this.chalOrderNo = chalOrderNo;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	
}
