package com.stylefeng.guns.insurance.vo;

import java.io.Serializable;

/**
 * 响应
 * @author Administrator
 *
 */
public class ResponseObject<T> implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 返回类型代码200-成功 
	 */
	private String chalCode;
	/**
	 * 消息描述
	 */
	private String state;
	/**
	 * 消息描述
	 */
	private String msg;
	/**
	 * 返回数据
	 */
	private T data;
	public String getChalCode() {
		return chalCode;
	}
	public void setChalCode(String chalCode) {
		this.chalCode = chalCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
}
