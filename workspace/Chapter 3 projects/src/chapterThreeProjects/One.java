package chapterThreeProjects;

import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		ezprint("Cube surface area calculator version 1.0");
		Scanner read = new Scanner(System.in);
		ezprint("Please enter cube side length");
		int side = read.nextInt();
		ezprint("The surface area of the cube is ", false);
		side = side*side*6;
		String area = String.valueOf(side);
		ezprint(area);
		
		
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
}
