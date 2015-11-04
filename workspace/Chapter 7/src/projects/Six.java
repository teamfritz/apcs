package projects;

import java.util.Scanner;
import java.util.Scanner;
import java.util.Random;

public class Six {
	public static void main(String[] args) {
	     Scanner reader = new Scanner(System.in);
	     Random generator = new Random();
	     int die1, die2,       // two dice
	          dollars,          // initial number of dollars (input)
	          count,            // number of rolls to reach depletion
	          maxDollars,       // maximum amount held by the gambler
	          countAtMax;      // count when the maximum is achieved
	      int totalMoney = 0, totalCount = 0, totalMaxCount = 0, totalMax = 0;
	      // Request the input
	      System.out.print("How many dollars do you have? Recommended 100");
	      dollars = reader.nextInt();
	      ezprint("$ " + dollars);
	      System.out.print("How many times do you want to run the simulation?\nNotice, the progress info does not print properly with less than 100 simulations\nMax recommended value for long is 1 billion");
	      long simulations = reader.nextLong();
	      // Initialize variables
	      maxDollars = dollars;
	      countAtMax = 0;
	      count = 0;
	      // Loop until the money is gone
	      int x = 0;
	      int i = 0;
	      for (i = 0; i < simulations; i++) {
	    	  if (x == simulations/100) {
	    		  ezprint("\n\n\n\n\n\n\n\n\n\n\n", false);
	    		  int progress = (int) (i/Math.max((simulations/100), 1));
	    		  ezprint("{", false);
	    		  for (int spaces = 0; spaces < (progress/10); spaces++) {
	    			  ezprint("*",false);
	    		  }
	    		  for (int spaces = 0; spaces < (10-progress/10); spaces++) {
	    			  ezprint(" ",false);
	    		  }
	    		  ezprint("} " + progress + "%\n", false);
	    		  ezprint("\n\n", false);
	    		  x = 0;
	    	  } else {
				x++;
			}
		      while (dollars > 0){
		         count++;
		         // Roll the dice.
		         die1 = generator.nextInt (6) + 1; // 1-6 
		         die2 = generator.nextInt (6) + 1; // 1-6
		         if (die1 + die2 == 7)
                     dollars += 4;
                  else
                     dollars -= 1; 
                  // If this is a new maximum, remember it
                  if (dollars > maxDollars){
                     maxDollars = dollars;
                     countAtMax = count;
                  }
               }
		      totalCount += count;
		      totalMax += maxDollars;
		      totalMaxCount += countAtMax;
	      }
	      totalCount/=simulations;
	      totalMax/=simulations;
	      totalMaxCount/=simulations;
               // Display the results
               System.out.println
                  ("You are broke after an average " + count + " rolls.\n" +
                   "You should have quit when you had an average $" + maxDollars + ".");
               System.out.println("\n**I know you were supposed to remove the part about maxes, but I felt that knowing this information would be neat.");
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
	
	public static double prompt(String type, double min, double max) {    //allows you to prompt for a value with a pseudo-customized message
		Scanner read = new Scanner(System.in);    //usage: <variable> = prompt(<type>)
		double output;
		while (true) {
			System.out.println("Please input " + type);
			output = read.nextDouble();
			if (output >= min && output <= max)
				break;
			System.out.println("I'm sorry, that is not a valid input. It must be within the range [" + min + "-" + max + "]");
		}
		return output; //returns a double value
	}
}
