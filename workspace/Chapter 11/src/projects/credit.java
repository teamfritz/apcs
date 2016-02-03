package projects;

public class credit extends bankAccount{
	private double limit;
	public credit() {
		balance = 0;
		name = "";
		limit = 10000;
	}
	
	public credit(String name, double bal, double limit) {
		this.name = name;
		balance = bal;
		this.limit = limit;
	}
	
	public boolean deposit(double amount) {
		balance -= amount;
		return true;
	}
	
	public boolean withdraw(double amount) {
		double temp = balance;
		balance += amount;
		if (balance > limit) {
			balance = temp;
			System.out.println("Error: you have hit your credit limit");
			return false;
		}
		return true;
	}
}
