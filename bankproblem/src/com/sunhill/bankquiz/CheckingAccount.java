package com.sunhill.bankquiz;

import org.apache.log4j.Logger;

import com.sunhill.bankquiz.exceptions.UnauthorizedAccessException;
import com.sunhill.bankquiz.exceptions.UnauthorizedOperationException;

/*
 * Account activities
 * @author lipika majumdar
 */

public class CheckingAccount extends Account {

	final static Logger logger = Logger.getLogger(CheckingAccount.class);

	public CheckingAccount(Customer customer, double accountBalance,
			double accountId) {
		super(customer, accountBalance, accountId);

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
				if (getAccountLimit() < ammount) {
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
