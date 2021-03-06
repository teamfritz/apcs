package chapterThreeProjects;

import java.util.Scanner;

public class Five {
	
	public static double wage, regH, overH, total = 0.0;

	public static void main(String[] args) {
		ezprint("Weekly salary calculator version 2.3");
		int days = (int) prompt("your working days in the week");
		days++;
		wage = prompt("your wage");
		for (int i = 1; i < days; i++) {
			String day = String.valueOf(i);
			regH = prompt("your regular hours worked for day " + day);
			overH = prompt("your overtime hours worked for day " + day);
			total += (regH*wage) + (overH*1.5*wage);
		}
		ezprint("----------------------------------------------------");
		ezprint("  Your total money earned is $", false);
		ezprint(total, false);
		ezprint(" over ", false);
		ezprint(days - 1, false);
		ezprint(" days!");
		ezprint("----------------------------------------------------");
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
