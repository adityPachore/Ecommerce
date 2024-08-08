package com.wu.ecommerce.exception;

public class InvalidIdException extends Exception {
	// only one constructor to accept the msgs
	public InvalidIdException(String msg) {
		super(msg);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}
}
