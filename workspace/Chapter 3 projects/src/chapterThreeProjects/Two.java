package chapterThreeProjects;

import java.util.Scanner;

public class Two {
static double radi, diam, circ, surf, volu;
	public static void main(String[] args) {
		ezprint("Sphere wizard 1.0");
		radi = prompt("radius");
		ezprint("Diameter is ", false);
		diam = radi*2.0;
		System.out.println(diam);
		ezprint("Circumference is ", false);
		circ = diam*3.1416;
		System.out.println(circ);
		ezprint("Surface area is ", false);
		surf = 4*3.1416*radi*radi;
		System.out.println(surf);
		ezprint("Volume is ", false);
		volu = radi*radi*radi*4.0*3.1416/3.0;
		System.out.println(volu);
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
	
	public static double prompt(String type) {    //allows you to prompt for a value with a pseudo-customized message
		Scanner read = new Scanner(System.in);    //usage: <variable> = prompt(<type>)
		System.out.println("Please input the " + type);
		double output = read.nextDouble();
		return output; //returns a double value
	}

}
