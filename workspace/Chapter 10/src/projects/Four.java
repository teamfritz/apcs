package projects;

import java.util.Scanner;

public class Four {
	
	public static void main(String[] args) {
		//initialize
		int[] list = new int[10];
		Scanner reader = new Scanner(System.in);
		//gather data
		ezprint("Please input 10 numbers");
		for (int i = 0; i < list.length; i++) {
			list[i] = reader.nextInt();
		}
		int median = findMedian(list);
		int mode = findMode(list);
		ezprint("The mode is " + mode);
		ezprint("The median is " + median);
	}
	
	public static int findMedian(int[] list) {
		int[] larger = new int[list.length];
		int[] smaller = new int[list.length];
		for (int i = 0; i < smaller.length; i++) {
			smaller[i] = 0;
			larger [i] = 0;
		}
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list.length; j++) {
				if (list[i] > list[j]) {
					larger[i]++;
				} else if (list[i] < list[j]) {
					smaller[i]++;
				}
			}
		}
		for (int i = 0; i < smaller.length; i++) {
			for (int j = 0; j < smaller.length; j++) {
				if(larger[j] == (smaller[j] + i)) {
					return list[j];
				}
				if(larger[j] == (smaller[j] - i)) {
					return list[j];
				}
				
			}
		}
		return 0;
	}
	
	public static int findMode(int[] list) {
		int[] mode = new int[list.length];
		for (int i = 0; i < mode.length; i++) {
			mode[i] = 0;
		}
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list.length; j++) {
				if (list[i] == list[j]) {
					mode[i]++;
				}
			}
		}
		int maxCount = 0;
		for (int i = 0; i < mode.length; i++) {
			maxCount = Math.max(maxCount, mode[i]);
		}
		for (int i = 0; i < mode.length; i++) {
			if (mode[i] == maxCount) {
				return list[i];
			}
		}
		return 0;
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
