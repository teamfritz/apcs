package Chapter5;

import java.util.Scanner;

import sounds.APSoundClip;
import sounds.Sample;

public class fourteen {

	public static void main(String[] args) {
		double delay = prompt("the desired delay");
		int newval2;
		int x = 1;
		//APSoundClip clip = new APSoundClip("C:\\Users\\APCS\\Downloads\\clip.wav");
		APSoundClip clip = new APSoundClip("C:\\Users\\APCS\\Downloads\\Toolkits\\Toolkits\\sounds\\Test Programs\\money.wav");
		clip.draw();
		clip.play();
		double counter = 0.0;
		for (Sample s : clip) {
			int newval = s.getValue();
			if (delay >= counter) {
				for (Sample y){
					
					newval2 = y.getValue();
				}
				}
				newval2 = y.getValue();
				if (x == 1) {
					x = 0;
					s.setValue(newval);
				} else {
					x = 1;
					s.setValue(newval2);
				}
			} else {
				counter= counter + 0.0;
				if (x == 1) {
					x = 0;
					s.setValue(newval);
				} else {
					x = 1;
					s.setValue(0);
				}
			}
			//alternate
		}
		
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
