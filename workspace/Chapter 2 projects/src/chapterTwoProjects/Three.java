package chapterTwoProjects;

import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		double kilo = 0, mile = 0;
		boolean valid = false; //used to make sure the input is positive
		Scanner read = new Scanner(System.in);
		System.out.println("Kilometers to nautical miles converter");
		while( valid == false) { //loops until input is 0+
			System.out.println("Please enter amount of kilometers");
			kilo = read.nextDouble();
			if(kilo >= 0)
				valid = true; //Exits loop if input is 0+
			else
				//System.out.println("ERROR input must 0 or greater");
				valid = true; //temporarily modified to disable this feature. Uncomment above line and remove this line to re-enable
		}
		mile = kilo/10000.0;
		mile = mile*(90*60);
		System.out.print(kilo);
		System.out.println(" kilometers is equal to ");
		System.out.print(mile);
		System.out.println(" Nautical Miles");
	}

}
