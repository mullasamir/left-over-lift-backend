package com.leftoverlift.dto;

public class BusinessRegResponse {
	private String message;
	private String errCode;
	private Integer vendorId;
	private BusinessRegRequest request;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public Integer getVendorId() {
		return vendorId;
	}

	public void setVendorId(Integer vendorId) {
		this.vendorId = vendorId;
	}

	public BusinessRegRequest getRequest() {
		return request;
	}

	public void setRequest(BusinessRegRequest request) {
		this.request = request;
	}

}
