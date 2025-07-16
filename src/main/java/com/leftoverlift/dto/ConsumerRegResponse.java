package com.leftoverlift.dto;

public class ConsumerRegResponse {
	private String message;
	private String errCode;
	private Integer consumerId;
	private ConsumerRegRequest request;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getConsumerId() {
		return consumerId;
	}

	public void setConsumerId(Integer consumerId) {
		this.consumerId = consumerId;
	}

	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public ConsumerRegRequest getRequest() {
		return request;
	}

	public void setRequest(ConsumerRegRequest request) {
		this.request = request;
	}

}
