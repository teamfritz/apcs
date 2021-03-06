package projects;

import java.util.Scanner;

public class One {
	
	public static void main(String[] args) {
		//Initialize Arrays and scanner
		Scanner reader = new Scanner(System.in);
		int[] oddList = new int[10];
		int[] evenList = new int[10];
		int[] negativeList = new int[10];
		boolean[] zero = new boolean[10];
		//Gather Input
		ezprint("Please input 10 integers");
		for (int i = 0; i < 10; i++) {
			int temp = reader.nextInt();
			if (temp % 2 == 0) {
				evenList[i] = temp;
			} else {
				oddList[i] = temp;
			}
			if (temp < 0) {
				negativeList[i] = temp;
			}
			if (temp == 0)
				zero[i] = true;
		}
		//Print Arrays
		int count = 0;
		ezprint("Evens");
		for (int s : evenList) {
			count++;
			if (!(s == 0) || zero[count-1])
				ezprint(s);
		}
		count = 0;
		ezprint("Odds");
		for (int s : oddList) {
			count++;
			if (!(s == 0) || zero[count-1])
				ezprint(s);
		}
		ezprint("Negatives");
		for (int s : negativeList) {
			if (!(s == 0))
				ezprint(s);
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
