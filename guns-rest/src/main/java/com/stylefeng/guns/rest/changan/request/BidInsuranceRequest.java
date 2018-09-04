package com.stylefeng.guns.rest.changan.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 长安保险-确认投保请求参数
 * @author Administrator
 *
 */
@XStreamAlias("PACKET type=\"REQUEST\" version=\"1.0\"")
public class BidInsuranceRequest {

	/**
	 * 渠道信息
	 */
	@XStreamAlias("CHANNEL")
	private ChannelVO channelVO; 
	/**
	 * 投保对象信息
	 */
	@XStreamAlias("HEAD")
	private HeadVO headVO;
	/**
	 * 请求体
	 */
	@XStreamAlias("BODY")
	private BodyVO bodyVO;
	public ChannelVO getChannelVO() {
		return channelVO;
	}
	public void setChannelVO(ChannelVO channelVO) {
		this.channelVO = channelVO;
	}
	public HeadVO getHeadVO() {
		return headVO;
	}
	public void setHeadVO(HeadVO headVO) {
		this.headVO = headVO;
	}
	public BodyVO getBodyVO() {
		return bodyVO;
	}
	public void setBodyVO(BodyVO bodyVO) {
		this.bodyVO = bodyVO;
	}
}
