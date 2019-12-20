public class ActTransact {

	int num;
	private String accountNum = Integer.toString(num);
	private int balance = 0;

	public ActTransact(String accountNumber, int balance) {
		super();
		this.accountNum = accountNum;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNum;
	}

	public void setAccountNum(String accountNumber) {
		this.accountNum = accountNum;
	}

	public int getBalance() {
		return balance;
	}

	public void deposit(int transactAmount) {
		if (balance == 0) {
			System.out.println("Insufficient Balance");
		} else {
			this.balance = (balance + transactAmount);
			System.out.println("Your balance after the transaction is :" + balance);
		}
	}

	public void withdraw(int transactionAmount) {
		if (balance < transactionAmount) {
			System.out.println("Insufficient Balance");
			System.out.println("Your balance after the transaction is: " + balance);
		} else {
			this.balance = (balance - transactionAmount);
			System.out.println("Your balance after the transaction is: " + balance);
		}
	}

}
