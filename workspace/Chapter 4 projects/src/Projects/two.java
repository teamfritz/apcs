package Projects;

import java.util.Scanner;

public class two {

public static void main(String[] args) {
		ezprint("This program checks if a triangle contains a right angle");
		double sideA = prompt("the length of side one");
		double sideB = prompt("the length of side two");
		double sideC = prompt("the length of side three");
		if (sideA*sideA+sideB*sideB==sideC*sideC||sideA*sideA+sideC*sideC==sideB*sideB||sideC*sideC+sideB*sideB==sideA*sideA)
			ezprint("The triangle is right");
		else
			ezprint("The triangle is not right");
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