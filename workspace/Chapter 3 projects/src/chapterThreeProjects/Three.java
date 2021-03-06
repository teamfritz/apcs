package chapterThreeProjects;

import java.util.Scanner;

public class Three {
	static Scanner read = new Scanner(System.in);
	static double output;
	static double velo;
	static double mass;
	static double moment;
	static double ke;

	public static void main(String[] args) {
		prompt("velocity", "meters per second");
		velo = output;
		prompt("mass", "kilograms");
		mass = output;
		moment = mass*velo;
		String momentumValue = String.valueOf(moment);
		System.out.println("The momentum in kilogram*meters per second is " +momentumValue);
		System.out.print("The kinetic energy is ");
		ke = velo*moment/2;
		System.out.println(ke);
	}
	
	public static double prompt(String type, String units) {    //allows you to prompt for a value with a pseudo-customized message
		System.out.println("Please input the " + type + " in " + units);
		output = read.nextDouble();
		return output;
	}
}
