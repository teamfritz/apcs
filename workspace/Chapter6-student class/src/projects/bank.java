package projects;

public class bank {
	private double balance;
	private String name;

	public bank() {
		balance = 0;
		name = "";
	}
	
	public bank(String name, double bal) {
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
}
