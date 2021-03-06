package Chapter5;

import java.util.Scanner;

import sounds.APSoundClip;
import sounds.Sample;

public class fourteen {

	public static void main(String[] args) {
		double delay = prompt("the desired delay");
		APSoundClip clip = new APSoundClip("C:\\Users\\APCS\\Downloads\\Toolkits\\Toolkits\\sounds\\Test Programs\\money.wav");
		APSoundClip clip2 = clip.clone();
		for (Sample s : clip) {
			int count = 1;
			int secondValue = 0;
			for (Sample y : clip2) {
				int count2 = 1;
				if (count2==count+delay)
					secondValue = y.getValue();
				count2++;
			}
			int newval = secondValue+s.getValue();
			s.setValue(newval);
			count++;
			clip.saveAs();
			ezprint(count);
		}
	}
	
	/*public secondValue( int c, int d) {
		APSoundClip clip = new APSoundClip("C:\\Users\\APCS\\Downloads\\Toolkits\\Toolkits\\sounds\\Test Programs\\money.wav");
		for (Sample y : clip) {
			int count2 = 1;
			if (count2==c+d)
				int secondValue = y.getValue();
			count2++;
		}
	}*/
	
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
