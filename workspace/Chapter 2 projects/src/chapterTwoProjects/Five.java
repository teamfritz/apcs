package chapterTwoProjects;

import java.util.Scanner;

public class Five {
	static Scanner read = new Scanner(System.in);
	static double output;
	static double velo;
	static double mass;
	static double moment;

	public static void main(String[] args) {
		prompt("velocity", "meters per second");
		velo = output;
		prompt("mass", "kilograms");
		mass = output;
		moment = mass*velo;
		String momentumValue = String.valueOf(moment);
		System.out.println("The momentum in kilogram*meters per second it " +momentumValue);
	}
	
	public static double prompt(String type, String units) {    //allows you to prompt for a value with a pseudo-customized message
		System.out.println("Please imput the " + type + " in " + units);
		output = read.nextDouble();
		return output;
	}
}
