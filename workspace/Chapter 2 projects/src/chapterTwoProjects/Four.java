package chapterTwoProjects;

public class Four {

	public static void main(String[] args) {
		int min = 1;    //one year
		min = min*365;  //365 days in a year
		min = min*24;   //24 hours in a day
		min = min*60;   //60 minutes in an hour
		System.out.print("There are ");
		System.out.print(min);
		System.out.print(" minutes in a year.");
	}

}
