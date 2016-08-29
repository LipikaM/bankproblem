package test.com.sunhill.bankquiz;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sunhill.bankquiz.CheckingAccount;
import com.sunhill.bankquiz.Customer;
import com.sunhill.bankquiz.SavingsAccount;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/*
 * Tests the functionality of Customer account balance
 * @author lipika majumdar
 */



public class CustomerAccountTest extends TestCase{
	
	private double balance;
	private double accountId;
	private double custId;
	private SavingsAccount account1;
	private SavingsAccount account2;
	private Customer customer1;
	private Customer customer2;
	
		
	/**
	 * Sets up the test case before testing any case
	 */
	@Before
	protected void setUp() {
		balance = 400;
		accountId = 201;
		custId=101;
		customer1 = new Customer(custId,accountId,600,2);
		customer2 = new Customer(102,202,1000,3);
		account1 = new SavingsAccount(customer1,balance, accountId);
		account2 = new SavingsAccount(customer2, balance, accountId);
		account1.setAccountBalance(400);
		account2.setAccountBalance(600);
		
	}
	
	//Test cases
	@Test
	public void testGetCustomerAccountBalance() {
		double currentBalance = account1.getAccountBalance();
		assertTrue(currentBalance == 400);
	}
	
	@Test
	public void testDeposit(){
		account1.deposit(accountId, 200);
		double currentBalance = account1.getAccountBalance();
		assertTrue(currentBalance == 600);
	}
	
	@Test
	public void testWithdraw(){
		account1.withdraw(accountId, 100);
		double currentBalance = account1.getAccountBalance();
		assertTrue(currentBalance == 300);
	}
	

	@Test
	public void testWithdrawLessThanWithdrawLimit(){
		CheckingAccount account1 = new CheckingAccount(customer1,balance, accountId);
		account1.withdraw(accountId, 500);
		double currentBalance = account1.getAccountBalance();
		assertTrue(currentBalance == -100);
	}
	
	@Test(expected = Exception.class)  
	public void testWithdrawMoreThanWithdrawLimit(){
		CheckingAccount account1 = new CheckingAccount(customer1,balance, accountId);
		account1.withdraw(accountId, 700);
	}
	
	/**
	 * Cleans up the test case after every test execution
	 */
	@After
	protected void tearDown() {
		 
	}
	
	/**
	 * Triggers the test
	 */
	public static TestSuite suite() {
		return new TestSuite(CustomerAccountTest.class);
	}
	

}
