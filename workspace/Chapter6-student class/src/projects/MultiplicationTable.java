package projects;

import java.util.Scanner;

public class MultiplicationTable {
	
public static void main(String[] args) {
		int length = (int)prompt(" how many rows and colums you want. Maximum 31 for formatting to work.\nYou can do more, but the formatting will be off.\nMinimum 10 for title to appear.\nOverall maximum 500 to prevent too much lag");
		int fancy = (int)prompt("1 for a fancy chart. Otherwise enter 0");
		int width = length*5+1;
		if (length > 31) {
			ezprint("\n\n\n\n*******************************\nWarning: Formatting will be off\n*******************************");
			ezprint("To continue press enter");
			Scanner reader = new Scanner(System.in);
			String validate = reader.nextLine();
		}
		if (length > 500) {
			ezprint("\n\n*********************\nWarning: Over Maximum\n*********************");
			return;
		}
		if (fancy == 1 && length >=10) {
			for (int l = 0; l < (width-26)/2; l++) {
				ezprint(" ",false);
			}
			ezprint("Multiplication chart of " + length);
		}
		for (int i = 1; i <= length; i++) {
			for (int k = 0; k < width; k++) {
				if (fancy==1)
					ezprint("-",false);
			}
			if(fancy==1)
				ezprint("\n|",false);
			ezprint(" ",false);
			for (int j = 1; j <= length; j++) {
				int k = i*j;
				if(k<10) {
					ezprint(" ",false);
				}
				if(k<100) {
					ezprint(" ",false);
				}
				ezprint(k,false);
				if(fancy==1)
					ezprint("|",false);
				ezprint(" ",false);
			}
			ezprint("");
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
	
	public static void ezprint(int statement) {
		System.out.println(statement);
	}
	
	public static void ezprint(int statement, Boolean newline) {
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
