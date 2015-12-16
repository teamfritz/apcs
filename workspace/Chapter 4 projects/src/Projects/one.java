package Projects;

import java.util.Scanner;

public class one {

public static void main(String[] args) {
		ezprint("Integer divider version 1.0");
		int a = (int) prompt("the first integer");
		int b = (int) prompt("the second integer to divide by");
		if (a>=b)
			ezprint("The answer is " + a/b + " r" + a%b);
		else
			ezprint("The answer is " + b/a + " r" + b%a);
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
