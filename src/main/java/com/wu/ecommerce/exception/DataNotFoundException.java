package com.wu.ecommerce.exception;

public class DataNotFoundException extends Exception {
	// only one constructor to accept the msgs
	public DataNotFoundException(String msg) {
		super(msg);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}
}
