package projects;

import java.util.Scanner;

public class test {
	
	public static void main(String[] args) {
		int[] cow = new int[2];
		cow[0]=1;
		ezprint(cow[0] + cow.length);
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
