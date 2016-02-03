package projects;

public class bankAccount {
	protected double balance;
	protected String name;
	protected final double DEFAULT_INTEREST = 1.01;

	public bankAccount() {
		balance = 0;
		name = "";
	}
	
	public bankAccount(String name, double bal) {
		this.name = name;
		balance = bal;
	}
	
	public boolean deposit(double amount) {
		balance += amount;
		return true;
	}
	
	public boolean withdraw(double amount) {
		double temp = balance;
		balance -= amount;
		if (balance < 0) {
			balance = temp;
			System.out.println("Error: not enough funds!");
			return false;
		}
		return true;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String toString() {
		return name + ": $" + balance;
	}
	
	public void applyInterest() { //applies interest of a default rate
		balance *= DEFAULT_INTEREST;
	}
	
	public void applyInterest(double rate) { //applies interest, given in percent
		balance *= ((rate/100) + 1);
	}

}
