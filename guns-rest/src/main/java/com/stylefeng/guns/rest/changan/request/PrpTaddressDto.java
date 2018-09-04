package com.stylefeng.guns.rest.changan.request;

/**
 * 长安保险-确认投保请求参数
 * 营业处所地址信息
 * @author Administrator
 *
 */
public class PrpTaddressDto {
	/**
	 * 地址序号（必填）
	 * 默认1
	 */
	private int AddressNo;
	/**
	 * 邮政编码（必填）
	 */
	private String AddressCode;
	/**
	 * 地址（必填）
	 */
	private String AddressName;
	public int getAddressNo() {
		return AddressNo;
	}
	public void setAddressNo(int addressNo) {
		AddressNo = addressNo;
	}
	public String getAddressCode() {
		return AddressCode;
	}
	public void setAddressCode(String addressCode) {
		AddressCode = addressCode;
	}
	public String getAddressName() {
		return AddressName;
	}
	public void setAddressName(String addressName) {
		AddressName = addressName;
	}
	
}
