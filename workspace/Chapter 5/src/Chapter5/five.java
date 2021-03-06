package Chapter5;

import images.APImage;
import images.Pixel;

import java.util.Scanner;

public class five {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int red = (int) prompt("the red filter");
		int blue = (int) prompt("the blue filter");
		int green = (int) prompt("the green filter");
		ezprint("Please input the file path using \\\\ for instead of \\");
		ezprint("An example would be: C:\\\\Users\\\\APCS\\\\Documents\\\\GitHub\\\\apcs\\\\workspace\\\\Chapter 5\\\\smokey.jpg");
		ezprint("Input Yes to use above image");
		String input = reader.nextLine();
		if (input.equals("yes") || input.equals("Yes")) {
			APImage image = new APImage("C:\\Users\\APCS\\Documents\\GitHub\\apcs\\workspace\\Chapter 5\\smokey.jpg");
			for (Pixel p: image) {
				p.setBlue(Math.max(Math.min(p.getBlue() + blue, 255), 0));
				p.setRed(Math.max(Math.min(p.getRed() + red, 255), 0));
				p.setGreen(Math.max(Math.min(p.getGreen() + green, 255), 0));
			}
			image.draw();
		} else {
			APImage image= new APImage(input);
			for (Pixel p: image) {
				p.setBlue(Math.max(Math.min(p.getBlue() + blue, 255), 0));
				p.setRed(Math.max(Math.min(p.getRed() + red, 255), 0));
				p.setGreen(Math.max(Math.min(p.getGreen() + green, 255), 0));
			}
			image.draw();
		};
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
