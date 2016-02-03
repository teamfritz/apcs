package projects;

public class checking extends bankAccount{
	public checking() {
		balance = 0;
		name = "";
	}
	
	public checking(String name, double bal) {
		this.name = name;
		balance = bal;
	}

}
