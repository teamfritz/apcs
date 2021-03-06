package chapterThreeProjects;

import java.util.Scanner;

public class Four {
	
	public static double wage, regH, overH, total = 0.0;

	public static void main(String[] args) {
		ezprint("Weekly salary calculator version 1.0");
		wage = prompt("your wage");
		regH = prompt("your regular hours worked");
		overH = prompt("your overtime hours worked");
		total += (regH*wage) + (overH*1.5*wage);
		ezprint("Total money earned is $", false);
		ezprint(total);
	}
	
	public static void ezprint(String statement) { //easily prints a string
		System.out.println(statement);
	}
	
	public static void ezprint(String statement, Boolean newline) {
		if(newline)
			System.out.println(statement);
		else
			System.out.print(statement);
	}
	
	public static void ezprint(double statement) { //easily prints a double
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
