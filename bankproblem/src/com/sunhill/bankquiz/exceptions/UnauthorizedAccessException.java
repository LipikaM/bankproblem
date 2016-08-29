package com.sunhill.bankquiz.exceptions;


/*
 * Custom exception to show unauthorized access
 * 
 */
public class UnauthorizedAccessException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UnauthorizedAccessException() {
	}

	public UnauthorizedAccessException(String message) {
		super("Unauthorized access!!");
	}
}
