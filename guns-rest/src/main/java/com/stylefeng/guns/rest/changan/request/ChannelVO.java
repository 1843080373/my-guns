package com.stylefeng.guns.rest.changan.request;

/**
 * 长安保险-确认投保请求参数
 * 渠道信息
 * @author Administrator
 *
 */
public class ChannelVO {

	/**
	 * 渠道代码（必填）
	 * 000160
	 */
	private String ChannelCode;
	/**
	 * 渠道机构代码（必填）
	 */
	private String ChannelComCode;
	/**
	 * 渠道产品代码（必填）
	 */
	private String ChannelProductCode;
	/**
	 * 渠道交易代码（必填）
	 *  2101(非预缴方式)
		2102(预缴方式)
		2103(实时支付出单)

	 */
	private String ChannelTradeCode;
	/**
	 * 渠道交易流水号（一次交易标识）（必填）
	 * 长度不能超过40
	 */
	private String ChannelTradeSerialNo;
	/**
	 * 渠道区域代码
	 * 根据实际情况提供
	 */
	private String ChannelAreaCode;
	/**
	 * 渠道交易日期（必填）
	 * 格式:yyyy-MM-dd HH:mm:ss
	 */
	private String ChannelTradeDate;
	public String getChannelCode() {
		return ChannelCode;
	}
	public void setChannelCode(String channelCode) {
		ChannelCode = channelCode;
	}
	public String getChannelComCode() {
		return ChannelComCode;
	}
	public void setChannelComCode(String channelComCode) {
		ChannelComCode = channelComCode;
	}
	public String getChannelProductCode() {
		return ChannelProductCode;
	}
	public void setChannelProductCode(String channelProductCode) {
		ChannelProductCode = channelProductCode;
	}
	public String getChannelTradeCode() {
		return ChannelTradeCode;
	}
	public void setChannelTradeCode(String channelTradeCode) {
		ChannelTradeCode = channelTradeCode;
	}
	public String getChannelTradeSerialNo() {
		return ChannelTradeSerialNo;
	}
	public void setChannelTradeSerialNo(String channelTradeSerialNo) {
		ChannelTradeSerialNo = channelTradeSerialNo;
	}
	public String getChannelAreaCode() {
		return ChannelAreaCode;
	}
	public void setChannelAreaCode(String channelAreaCode) {
		ChannelAreaCode = channelAreaCode;
	}
	public String getChannelTradeDate() {
		return ChannelTradeDate;
	}
	public void setChannelTradeDate(String channelTradeDate) {
		ChannelTradeDate = channelTradeDate;
	}
}
