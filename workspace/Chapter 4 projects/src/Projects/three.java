package Projects;

import java.util.Scanner;

public class three {

public static void main(String[] args) {
		ezprint("Telephone cost calculator version 1.0");
		int minutes = (int)prompt(" the phone call length");
		double cost = 0;
		if(minutes <= 0)
			ezprint("Did you not call or something? Your cost is $0");
		else {
			cost += 1.15;
			minutes -= 2;
			if(minutes >=1)
				cost += minutes*0.5;
			ezprint("The total cost of the phone call was $" + cost);
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
