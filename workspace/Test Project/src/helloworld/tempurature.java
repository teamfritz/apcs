
package helloworld;

import java.util.Scanner;

public class tempurature {

	public static void main(String[] args) {
		double input = 0, output = 0, type = 0;
		boolean valid = false;
		Scanner read = new Scanner(System.in);
		while(valid == false) {
			System.out.println("Would you like to go from celcius to farenheit [1] or ftom farenheit to celcius [2]");
			type = read.nextDouble();
			if (type==1||type==2) {
				valid = true;
			}
			else {
				System.out.println("Invalid Response. Must be within 1 to 2");
			}
		}
		System.out.println("Please enter the current temperature");
		input = read.nextDouble();
		if(type==1) {
			output = input*1.8+32.0;
		}
		else {
			output = (input-32.0)/1.8;
		}
		System.out.println("The tempuratur converstion is");
		System.out.print(output);
	}

}
