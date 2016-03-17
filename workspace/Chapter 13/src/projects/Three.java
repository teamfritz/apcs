package projects;

import java.awt.Image;
import java.io.Reader;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Three {
	static public String adder;
	
public static void main(String[] args) {
		int testVar = //(int)prompt("the number");
					 (int)prompter("Please input a number");
		ezprint("[Answer] " + addCommas(testVar));
	}
	public static String addCommas(int number) {
		if (number-1000 <= 0) {
			String out = number + "";
			return out;
		}
		int newNumber = 1000*(number/1000); //removes last 3 digits
		System.out.println("[Debug] " + (number-newNumber));
		return addCommas(newNumber/1000) + "," + (number-newNumber);
		
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
		System.out.println("[Prompt] Please input " + type);
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
	
	public static double prompter(String instructions) {
		JFrame window = new JFrame();
		String result = JOptionPane.showInputDialog(window, instructions);
		int resultInt;
		try {
			resultInt = Integer.parseInt(result);
		} catch (Exception e) {
			ImageIcon icon = new ImageIcon("C:\\Users\\APCS\\Downloads\\ic_error_outline_black_24dp\\ic_error_outline_black_24dp\\web\\ic_error_outline_black_24dp_2x.png");
			JOptionPane.showMessageDialog(window, "Sorry, we we not able to parse that.\nWe will now proceed to try and use the CLI","Error",JOptionPane.INFORMATION_MESSAGE,icon);
			resultInt = (int) prompt("a number. Sorry the gui did not work for you.", 0, Integer.MAX_VALUE);
		}
		return resultInt;
	}

}
