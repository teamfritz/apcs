package projects;

import java.util.Scanner;

public class three {
	
	public static void main(String[] args) {
		fraction test1 = new fraction(1, 2);
		fraction test2 = new fraction(1, 3);
		fraction test3 = test1.addTo(test2);
		ezprint(test3.toStringOneLine());
		test3 = test1.subtractFrom(test2);
		ezprint(test3.toStringOneLine());
		test3 = test1.divideBy(test2);
		ezprint(test3.toStringOneLine());
		test3 = test1.multiplyBy(test2);
		ezprint(test3.toStringOneLine());
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
