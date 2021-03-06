package Chapter5;

import images.APImage;
import images.Pixel;

import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		APImage image = new APImage("C:\\Users\\APCS\\Documents\\GitHub\\apcs\\workspace\\Chapter 5\\smokey.jpg");
		image.draw();
		for(Pixel p : image) {
			if(p.getBlue()<=127)
				p.setBlue(p.getBlue()*2);
		}
		image.draw();
		reader.nextLine();
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
