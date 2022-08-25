package com.pro.wings.SpringBootCrudOperation.exception;

public class MyCusomeException extends RuntimeException{
	
	String msg;
	
	public MyCusomeException(String msg) {
		
		super(msg);
		
		this.msg = msg;
	}

}
