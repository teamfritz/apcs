package projects;

import java.util.Scanner;

public class Three {
	
	public static void main(String[] args) {
		double rate = 0.01*prompt("the interest rate.");
		double principal = prompt("the principal");
		double years = prompt("funding peiod in years");
		double amountEarned = 2;
		ezprint("Year  Start of year   Interest        End of year");
		for (int i = 0; i < years; i++) {
			amountEarned = principal*(Math.pow((1 + rate/4), 4))-principal;
			System.out.printf("%03d:  $%-14.2f $%-14.2f ",i, principal, amountEarned);
			principal=principal*(Math.pow((1 + rate/4), 4));
			System.out.printf("$%-14.2f\n", principal);
		}
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
	
	public static double prompt(String type, double min, double max) {    //allows you to prompt for a value with a pseudo-customized message
		Scanner read = new Scanner(System.in);    //usage: <variable> = prompt(<type>)
		double output;
		while (true) {
			System.out.println("Please input " + type);
			output = read.nextDouble();
			if (output >= min && output <= max)
				break;
			System.out.println("I'm sorry, that is not a valid input. It must be within the range [" + min + "-" + max + "]");
		}
		return output; //returns a double value
	}
}
