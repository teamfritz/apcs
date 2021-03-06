package Chapter5;

import images.APImage;
import images.Pixel;

import java.util.Random;
import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		APImage image = new APImage("C:\\Users\\APCS\\Documents\\GitHub\\apcs\\workspace\\Chapter 5\\smokey.jpg");
		Random rand = new Random();
		int reda = rand.nextInt(256);
		int blua = rand.nextInt(256);
		int grea = rand.nextInt(256);
		int redb = rand.nextInt(256);
		int blub = rand.nextInt(256);
		int greb = rand.nextInt(256);
		image.draw();
		for (Pixel p: image) {
			int avg = (p.getBlue() + p.getGreen() + p.getRed())/3;
			if (avg >= 127) {
				p.setBlue(blua);
				p.setGreen(grea);
				p.setRed(reda);
			} else {
				p.setBlue(blub);
				p.setGreen(greb);
				p.setRed(redb);
			}
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
