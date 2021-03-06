package projects;

import java.util.Random;
import java.util.Scanner;

public class Two {
	public static void main(String[] args) {
		ezprint("Start");
		int guessFrom = 0, way = 0, number = 0;
		Random randi = new Random();
		int guesses = 0;
		boolean correct = false;
		ezprint("Debug Point 2");
		while (number < 1 || number > 100) {
			number = (int) prompt("the number you would like the computer to guess [1-100]");
		}
		ezprint("In what way do you want the computer to guess your number?");
		/*while (!(way ==1) && !(way ==2)) {
			way = (int) prompt("1 for the most efficient way.\nPlease input 2 for a touch of randomness.");
		}*/
		way = 1;
		while (correct == false && way == 1) {
			int guess = (int) (guessFrom + (100/(Math.pow(2, guesses+1))));
			if (guess > number) {
				if (guess == guessFrom)
					guessFrom--;
			}
			else if (guess < number) {
				if (guess == guessFrom)
					guessFrom++;
			}
			guess = (int) (guessFrom + (100/(Math.pow(2, guesses+1))));
			ezprint(guess);
			if (guess > number) {
				ezprint("Too high.");
			}
			else if (guess < number) {
				ezprint("Too low");
				guessFrom += (int)(100/(Math.pow(2, guesses+1)));
			}
			else
				correct = true;
			ezprint("Debug [guessFrom] = " + guessFrom);
			guesses++;
		}
		ezprint("The computer guessed the number " + number + " in " + guesses + " guesses!");
		
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
