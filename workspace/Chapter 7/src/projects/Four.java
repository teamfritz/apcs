package projects;

import java.util.Scanner;

public class Four {
	public static void main(String[] args) {
		int totalScore = 0, totalGrades = 0, maxScore = 0;
		while (true) {
		int input = (int) (prompt("the score", -1, 100));
		if (input == -1)
			break;
		ezprint("The student got a(n) " + getLetterGrade(input));
		totalGrades++;
		totalScore += input;
		maxScore = Math.max(maxScore, input);
		}
		int avgScore = totalScore / totalGrades;
		ezprint("The Highest grade was " + maxScore + " which is a " + getLetterGrade(maxScore));
		ezprint("The average grade was " + avgScore + " which is a " + getLetterGrade(avgScore));
	}
	
	public static String getLetterGrade (int score){
		String grade;
		if (score >= 90)
			grade = "A";
		else if (score >= 80)
			grade = "B";
		else if (score >= 70)
			grade = "C";
		else if (score >= 60)
			grade = "D";
		else
			grade = "F";
		if (!(score==100)&&!(score<60)) {
			int after = score%10;
			if (after >= 6)
				grade += "+";
			if (after <= 1)
				grade += "-";
		}
		if (score==100)
			grade += "+";
		return grade;
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
