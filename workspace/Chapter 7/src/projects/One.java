package projects;

import java.util.Random;
import java.util.Scanner;

public class One {
	public static void main(String[] args) {
		Random randi = new Random();
		int number = randi.nextInt(99)+1, guesses = 0;
		boolean correct = false;
		while (correct == false) {
			int guess = (int) prompt("your guess [1-100]");
			if (guess > number)
				ezprint("Too high.");
			else if (guess < number)
				ezprint("Too low");
			else
				correct = true;
			guesses++;
		}
		ezprint("You guessed the number " + number + " in " + guesses + " guesses!");
		ezprint("   ______                             __       __\n  / ____/___  ____  ____ __________ _/ /______/ /\n / /   / __ \\/ __ \\/ __ `/ ___/ __ `/ __/ ___/ / \n/ /___/ /_/ / / / / /_/ / /  / /_/ / /_(__  )_/  \n\\____/\\____/_/ /_/\\__, /_/   \\__,_/\\__/____(_)   \n                 /____/                          ");
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
