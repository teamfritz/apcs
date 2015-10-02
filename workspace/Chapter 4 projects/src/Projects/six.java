package Projects;

import java.util.Scanner;

public class six {

public static void main(String[] args) {
		ezprint("Population growth estimator");
		int cycles = 0;
		int startPop = (int) prompt("the initial population");
		int growth = (int) validPrompt("the growth rate",0);
		int period = (int) prompt("the growth period");
		int length = (int) prompt("the total amount of time to grow");
		for (int i = 0; i < (length/period); i++) {
			startPop *= growth;
			cycles++;
		}
		ezprint("The end population is " + startPop + " with " + cycles + " cycles.");
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
	
	public static double validPrompt(String type, int minimum) {    //allows you to prompt for a value with a pseudo-customized message
		Scanner read = new Scanner(System.in);    //usage: <variable> = prompt(<type>)
		boolean valid = false;
		double output = 0;
		while (!valid) {
			System.out.println("Please input " + type);
			output = read.nextDouble();
			if (output >= minimum) {
				valid = true;
			}
			else {
				System.out.println("The value must be minimum " + minimum);
			}
		}
		return output; //returns a double value
	}

}
