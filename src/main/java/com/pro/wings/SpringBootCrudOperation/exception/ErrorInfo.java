package com.pro.wings.SpringBootCrudOperation.exception;

import java.util.Date;

public class ErrorInfo {

	private Date timeStamp;
	private String msg;
	private String details;

	public ErrorInfo() {
		super();
		
	}

	public ErrorInfo(Date timeStamp, String msg, String details) {
		super();
		this.timeStamp = timeStamp;
		this.msg = msg;
		this.details = details;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "ErrorInfo [timeStamp=" + timeStamp + ", msg=" + msg + ", details=" + details + "]";
	}

}
