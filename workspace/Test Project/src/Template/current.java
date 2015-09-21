package Template;

import java.util.Scanner;

public class current {

	public static void main(String[] args) {
		
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

	public static double prompt(String type) {    //allows you to prompt for a value with a pseudo-customized message
		Scanner read = new Scanner(System.in);
		System.out.println("Please imput the " + type);
		double output = read.nextDouble();
		return output; //returns a double value
	}
}
