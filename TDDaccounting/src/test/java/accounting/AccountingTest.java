package accounting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AccountingTest {
	
	protected double credit, debit, balance;
	AccountEngine engine = new AccountEngine(0);
	

	@Before
	public void setUp() throws Exception {
		
		credit = 1000;
		debit = 500;
	}

	//Passes
	@Test
	public void testDeposit() {
		engine.depositFunds(credit);
		double balance = engine.getBalance();
		System.out.println("First balance:" + balance);
		assertEquals(1000, balance, 0.0);
		
		
	}

	//Fails (on purpose to demonstrate err) because class needs setter for the balance 
	@Test
	public void testWithdrawl() {
		engine.debitFunds(debit);
		double balance = engine.getBalance();
		System.out.println("Second balance:" +  balance);
		assertEquals(500, balance, 0.0);
		
		
	}
	 
}
