package Projects;

import java.util.Scanner;

public class four {

public static void main(String[] args) {
		long number = (long) prompt("an integer at least 0"), product = 1, count = 1;
		while (count <= number) {
			product = product*count;
			ezprint((double)product);
			count++;
		}
		ezprint("The factorial of " + number + " is " + product);
	}

/********************************************************************************************************************************
20! Shows up as negative because the integer goes so high that it runs out of memory and rolls over to the lowest possible value.
Now that it is of type "long" the number can be larger before it rolls over.
The new maximum value is: 20
********************************************************************************************************************************/
	
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
