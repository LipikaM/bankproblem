package com.sunhill.bankquiz;

public class Customer {
	
	private double customerId;
	private double accountNumber;
	private double accountLimit;
	private double interestRate;
		
	public Customer() {
		super();
	}
		
	public Customer(double customerId, double accountNumber,
			double accountLimit, double interestRate) {
		super();
		this.customerId = customerId;
		this.accountNumber = accountNumber;
		this.accountLimit = accountLimit;
		this.interestRate = interestRate;
	}

	public double getCustomerId() {
		return customerId;
	}
	public void setCustomerId(double customerId) {
		this.customerId = customerId;
	}
	public double getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(double accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAccountLimit() {
		return accountLimit;
	}
	public void setAccountLimit(double accountLimit) {
		this.accountLimit = accountLimit;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	

}
