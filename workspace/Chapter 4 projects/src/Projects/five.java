package Projects;

import java.util.Scanner;

public class five {

public static void main(String[] args) {
		ezprint("Pi calculator");
		double pi = 0;
		double iterate = prompt("how accurate you want PI to be");
		for (int i = 1; i < ((iterate/2)+1); i++) {
			int it = 1;
			ezprint("\n\n\n[" + (double)i*100/(iterate) + "%] " + pi*4 + "\n\n", false);
			pi = pi - (1.0/((4.0*i)-1.0));
		}
		for (int i = 1; i < ((iterate/2)+0.5); i++) {
			ezprint("\n\n\n[" + (((double)i*(100/iterate))+50.0) + "%] " + pi*4 + "\n\n", false);
			pi = pi + (1.0/((4.0*i)-3.0));
		}
		pi *=4;
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
