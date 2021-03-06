package Chapter5;

import java.util.Scanner;

import sounds.APSoundClip;
import sounds.Sample;

public class Six {

	public static void main(String[] args) {
		double factor = prompt("the desired volume factor");
		//APSoundClip clip = new APSoundClip("C:\\Users\\APCS\\Downloads\\clip.wav");
		APSoundClip clip = new APSoundClip("C:\\Users\\APCS\\Downloads\\Toolkits\\Toolkits\\sounds\\Test Programs\\money.wav");
		for (Sample s : clip) {
			int newval = (int)(factor*s.getValue());
			s.setValue(newval);
		}
		clip.draw();
		clip.play();
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
