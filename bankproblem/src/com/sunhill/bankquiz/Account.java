package com.sunhill.bankquiz;


/*
 * This follows an abstract design pattern for the code design
 * Account will provide an abstract mean of deposit, withdraw & currentBalance
 * @author lipika majumdar
 */
public abstract class Account extends Customer{

	private double accountId;
	private double accountBalance = 0;
	
	public Account(Customer customer, double accountBalance, double accountId) {
		super();
		this.accountId = accountId;
		this.accountBalance = accountBalance;
		
	}

	public abstract void deposit(double account, double ammount);

	public abstract void withdraw(double account, double ammount);
		
	public abstract double getCurrentAccountBalance(double accId);
	
	public Customer getCustomer(double accountId){
		// database call to get the customer by accountId
		Customer cust = new Customer();
		return cust;
	}
		
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
	
}
