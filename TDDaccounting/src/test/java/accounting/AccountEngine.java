package accounting;

public class AccountEngine {
	
	protected double balance = 0;
	protected double credit;

	public AccountEngine(int i) {
		balance = i;
	}

	public void depositFunds(double credit) {
		this.balance = balance + credit;
		
	}

	public void debitFunds(double withdrawl) {
		this.balance = balance - withdrawl;
	}
	
	public double getBalance() {
		return balance;
	}

}
