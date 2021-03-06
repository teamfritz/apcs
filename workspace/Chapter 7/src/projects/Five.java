package projects;

import java.util.Scanner;

public class Five {
	public static void main(String[] args) {
		int a = (int) prompt("the first number");
		int b = (int) prompt("the second number");
		if (b > a) { //sets a to be the larger number
			int temp = a;
			a = b;
			b = temp;
		}
		ezprint(a + ", " + b);
		int remainder = a%b;
		ezprint("Remainder: " + remainder);
		while(!(remainder == 0)) {
			a = b;
			b = remainder;
			ezprint(a + ", " + b);
			remainder = a%b;
			ezprint("Remainder: " + remainder);
		}
		ezprint("The GCD is " + b);
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
