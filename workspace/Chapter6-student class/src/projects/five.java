package projects;

import java.util.Scanner;

public class five {
	
	public static void main(String[] args) {
		bank test1 = new bank("Alex", 100);
		ezprint(test1.toString());
		test1.deposit(50.0);
		ezprint(test1.toString());
		test1.withdraw(170);
		ezprint(test1.toString());
		test1.withdraw(120);
		ezprint(test1.toString());
	}
	
	public static void ezprint(String statement) {
		System.out.println(statement);
	}
	
	public static void ezprint(String statement, Boolean newline) {
		if(newline)
			System.out.println(statement);
		else
			System.out.print(statement);
	}
	
	public static void ezprint(double statement) {
		System.out.println(statement);
	}
	
	public static void ezprint(double statement, Boolean newline) {
		if(newline)
			System.out.println(statement);
		else
			System.out.print(statement);
	}

	public static double prompt(String type) {    //allows you to prompt for a value with a pseudo-customized message
		Scanner read = new Scanner(System.in);    //usage: <variable> = prompt(<type>)
		System.out.println("Please input " + type);
		double output = read.nextDouble();
		return output; //returns a double value
	}

}
