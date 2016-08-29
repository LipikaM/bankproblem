package com.sunhill.bankquiz;


/*
 * Account will provide an abstract mean of deposit, withdraw & currentBalance
 * @author lipika majumdar
 */
public abstract class Account{

	private Customer customer;
	private double accountId;
	private double accountBalance = 0;
	
	public Account(Customer customer, double accountBalance, double accountId) {
		super();
		this.customer = customer;
		this.accountId = accountId;
		this.accountBalance = accountBalance;
		
	}

	public abstract void deposit(double account, double ammount);

	public abstract void withdraw(double account, double ammount);
		
	public abstract double getCurrentAccountBalance(double accId);

	public double getAccountId() {
		return accountId;
	}

	public void setAccountId(double accountId) {
		this.accountId = accountId;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
