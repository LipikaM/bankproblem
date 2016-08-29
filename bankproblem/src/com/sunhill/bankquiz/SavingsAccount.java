package com.sunhill.bankquiz;

import java.util.Map;

import org.apache.log4j.Logger;

import com.sunhill.bankquiz.exceptions.UnauthorizedAccessException;
import com.sunhill.bankquiz.exceptions.UnauthorizedOperationException;

public class SavingsAccount extends Account {

	final static Logger logger = Logger.getLogger(SavingsAccount.class);

	private Map<String, Double> interestForAllUsers;

	public SavingsAccount(Customer customer, double balance, double accountId) {
		super(customer, balance, accountId);

	}

	public Map<String, Double> provideInterestToAllUsers() {
		return interestForAllUsers;
	}

	@Override
	public void deposit(double account, double ammount) {
		try {
			if (account != getAccountId()) {
				throw new UnauthorizedAccessException();
			} else {
				double currentBalance = getAccountBalance();
				currentBalance = currentBalance + ammount;
				setAccountBalance(currentBalance);
			}
		} catch (UnauthorizedAccessException ex) {
			logger.error("Unauthorized Account!!!");
		}

	}

	@Override
	public void withdraw(double account, double ammount) {
		try {
			if (account != getAccountId()) {
				throw new UnauthorizedAccessException();
			} else {
				if (getAccountBalance() < ammount) {
					throw new UnauthorizedOperationException();
				} else {
					double currentBalance = getAccountBalance();
					currentBalance = currentBalance - ammount;
					setAccountBalance(currentBalance);
				}
			}
		} catch (UnauthorizedAccessException | UnauthorizedOperationException ex) {
			logger.error("Unauthorized Account!!!");
		}

	}

	@Override
	public double getCurrentAccountBalance(double accId) {
		try {
			if (accId != getAccountId()) {
				throw new UnauthorizedAccessException();
			}
		} catch (UnauthorizedAccessException ex) {
			logger.error("Unauthorized Account!!!");
		}
		return getAccountBalance();

	}


}
