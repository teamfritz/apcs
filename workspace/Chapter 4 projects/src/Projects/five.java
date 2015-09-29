package Projects;

import java.nio.channels.Pipe;
import java.util.Scanner;

public class five {

public static void main(String[] args) {
		ezprint("Pi calculator");
		double pi = 0;
		double iterate = prompt("how accurate you want PI to  be");
		if (iterate >= 25) {
			ezprint("This is a large amount, are you sure you want to do this?");
			ezprint("It could slow down your computer (y/n)");
			String response = promptForString();
			if (response == "n") {
				int n = 0;
				n = 1/n;
			}
		}
		for (int i = 1; i < ((iterate/2)+1); i++) {
			ezprint("Iterated a 1 time");
			pi -= (1/(4*i-1));
		}
		for (int i = 1; i < ((iterate/2)); i++) {
			ezprint("Iterated b 1 time");
			pi += (1/(4*i-3));
		}
		ezprint("Pi is " + pi + " for your current accuracy");
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
	
	public static String promptForString() {    //allows you to prompt for a value with a pseudo-customized message
		Scanner read = new Scanner(System.in);    //usage: <variable> = prompt(<type>)
		String output = read.nextLine();
		return output; //returns a string
	}

}
