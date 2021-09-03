package p06class.p01textbook.exercises.p19;

public class Account {
	
	private static final int MAX_BALANCE = 1000000;
	
	private int balance;

	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		if (balance >= 0 && balance <= MAX_BALANCE) {
			this.balance = balance;
		}
	}
	
}
