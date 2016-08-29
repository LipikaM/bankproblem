package com.sunhill.bankquiz;

/*
 * Bank customer pojo with Account(Composite data type) associated with it.
 */
public class Customer {
	
	private double customerId;
	private double accountLimit;
	private double interestRate;
	private Account account; // this attribute can further extend to list of the accounts as a customer can have multiple accounts
		
	public Customer() {
		super();
	}
		
	public Customer(double customerId, Account account,
			double accountLimit, double interestRate) {
		super();
		this.customerId = customerId;
		this.account = account;
		this.accountLimit = accountLimit;
		this.interestRate = interestRate;
	}

	public double getCustomerId() {
		return customerId;
	}
	public void setCustomerId(double customerId) {
		this.customerId = customerId;
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

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	

}
