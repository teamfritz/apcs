package Projects;

import java.util.Scanner;

public class seven {
	static boolean x = true;

public static void main(String[] args) {
		ezprint("Powers of 2 calculator");
		while (x) {
			double power = prompt("the power of 2 you would like\nEnter a negative number to quit");
			if (power < 0) {
				x = false;
				ezprint("You have successfuly ended the program.");
			}
			else {
				double answer = 1.0;
				for (int i = 0; i < power; i++) {
					answer = answer*2.0;
				}
				ezprint("2^" + power + " = " + answer);
			}
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

}
