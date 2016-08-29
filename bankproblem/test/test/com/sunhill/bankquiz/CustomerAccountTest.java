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
	private double accountId1;
	private double accountId2;
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
		accountId1 = 201;
		accountId2 = 202;
		customer1 = new Customer(101,accountId1,600,2);
		customer2 = new Customer(102,accountId2,1000,3);
		account1 = new SavingsAccount(customer1, balance, accountId1);
		account2 = new SavingsAccount(customer2, balance, accountId2);
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
		account1.deposit(accountId1, 200);
		double currentBalance = account1.getAccountBalance();
		assertTrue(currentBalance == 600);
	}
	
	@Test
	public void testWithdraw(){
		account1.withdraw(accountId1, 100);
		double currentBalance = account1.getAccountBalance();
		assertTrue(currentBalance == 300);
	}
	

	@Test
	public void testWithdrawLessThanWithdrawLimit(){
		CheckingAccount account1 = new CheckingAccount(customer1,balance, accountId1);
		account1.withdraw(accountId1, 500);
		double currentBalance = account1.getAccountBalance();
		assertTrue(currentBalance == -100);
	}
	
	@Test(expected = Exception.class)  
	public void testWithdrawMoreThanWithdrawLimit(){
		CheckingAccount account1 = new CheckingAccount(customer1,balance, accountId1);
		account1.withdraw(accountId1, 700);
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
