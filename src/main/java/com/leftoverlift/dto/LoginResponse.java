package com.leftoverlift.dto;

public class LoginResponse {
	private String role;
	private int id;
	private String message;

	public LoginResponse(String role, int id, String message) {
		this.role = role;
		this.id = id;
		this.message = message;
	}

	public String getRole() {
		return role;
	}

	public int getId() {
		return id;
	}

	public String getMessage() {
		return message;
	}
}