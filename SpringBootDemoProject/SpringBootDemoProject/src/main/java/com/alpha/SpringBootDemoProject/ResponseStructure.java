package com.alpha.SpringBootDemoProject;

public class ResponseStructure<T> {
	private int Statuscode;
	private String message;
	private T data;
	public int getStatuscode() {
		return Statuscode;
	}
	public void setStatuscode(int statuscode) {
		Statuscode = statuscode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public ResponseStructure(int statuscode, String message, T data) {
		super();
		Statuscode = statuscode;
		this.message = message;
		this.data = data;
	}
	public ResponseStructure() {
		super();
	}
	@Override
	public String toString() {
		return "ResponseStructure [Statuscode=" + Statuscode + ", message=" + message + ", data=" + data + "]";
	}
	
	
}
