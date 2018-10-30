package com.shantanubansal.models;

public class RestfulResponse {

	private String message = "Success";
	private boolean status = true;
	private Object data;
	private boolean success = true;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
