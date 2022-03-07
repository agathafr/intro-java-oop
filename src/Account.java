
public class Account {

	private double balance;
	private int agencyNumber;
	private int accountNumber;
	private Client accountOwner;
	private static int total;
	
	public Account(int agencyNumber, int accountNumber) {
		Account.total++;
		System.out.println("The total of accounts is " + Account.total);
		if(agencyNumber <= 0) {
			System.out.println("Invalid!");
		}
		
		this.agencyNumber = agencyNumber;
		this.accountNumber = accountNumber;
		
		System.out.println("I'm creating an account...");
	}
	
	public void deposit(double value) {
		this.balance += value;
	}

	public boolean withdraw(double value) {
		if (this.balance >= value) {
			this.balance = this.balance - value;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfer(double value, Account destiny) {
		if (this.balance >= value) {
			this.withdraw(value);
			destiny.deposit(value);
			return true;
		}
		return false;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public int getAccountNumber() {
		return this.accountNumber;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Client getAccountOwner() {
		return this.accountOwner;
	}
	
	public int getAgencyNumber() {
		return this.accountNumber;
	}
	
	public void setAgencyNumber(int agencyNumber) {
		this.agencyNumber = agencyNumber;
	}
	
	public void setAccountOwner(Client accountOwner) {
		this.accountOwner = accountOwner;
	}
	
	public static int getTotal() {
		return Account.total;
	}
	
}
