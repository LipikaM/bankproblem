package com.sunhill.bankquiz.exceptions;

public class UnauthorizedOperationException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UnauthorizedOperationException() {
	}

	public UnauthorizedOperationException(String message) {
		super("Balance is not sufficient!!");
	}


}
