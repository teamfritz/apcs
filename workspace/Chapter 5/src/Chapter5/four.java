package Chapter5;

import images.APImage;
import images.Pixel;

import java.util.Random;
import java.util.Scanner;

public class four {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		APImage image = new APImage("C:\\Users\\APCS\\Documents\\GitHub\\apcs\\workspace\\Chapter 5\\smokey.jpg");
		image.draw();
		for (Pixel p: image) {
			int avg = (p.getBlue() + p.getGreen() + p.getRed())/3;
			p.setBlue(avg);
			p.setGreen(avg);
			p.setRed(avg);
			int red = p.getRed();
			int blue = p.getBlue();
			int green = p.getGreen();
			if (red < 63) {
				red = (int) (red*1.1);
				blue = (int) (blue*0.9);
			} else if (red < 192) {
				red = (int) (red*1.15);
				blue = (int) (blue*0.85);
			} else {
				red = Math.min((int)(red*1.08), 255);
				blue = (int)(blue * 0.93);
			}
			p.setBlue(blue);
			p.setGreen(green);
			p.setRed(red);
		}
		image.draw();
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
