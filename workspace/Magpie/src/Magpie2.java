/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
			statement.trim();
		if (statement.indexOf("no") >= 0
				|| statement.indexOf(" no.") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("your name") >= 0)
		{
			response = randomChoose("I was not given a name", "I don't have a name", "Names are overrated.");
		}
		else if (statement.indexOf("why") >= 0
				|| statement.indexOf("how") >= 0)
		{
			response = randomChoose("The universe has many wonders", "You should know the answer", "That is a wonder!");
		}
		else if (statement.indexOf("Mr. Gehringer") >= 0)
		{
			response = "He sounds like a nice teacher.";
		}
		else if (statement.indexOf("nathan") >= 0)
		{
			response = "Nathan must be a nice guy!";
		}
		else if (statement.length() <= 1)
		{
			response = randomChoose("I feel like i'm talking to myself", "Say something!", "This is worse than talking to a rock. Say something!");
		}
		else if (statement.indexOf("cat") >= 0
				|| statement.indexOf("dog") >= 0)
		{
			response = randomChoose("Tell me more about your pets.", "I have a cat myself.");
		}
		else if (statement.indexOf("yes") >= 0)
		{
			response = "More people should be positive like you";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichResponse == 4)
		{
			response = "Go on...";
		}
		else if (whichResponse == 5)
		{
			response = "Well, what do you think of it?";
		}

		return response;
	}
	
	private String randomChoose(String a, String b) {
		{
			final int NUMBER_OF_RESPONSES = 2;
			double r = Math.random();
			int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
			String response = "";
			
			if (whichResponse == 0)
			{
				response = a;
			}
			else if (whichResponse == 1)
			{
				response = b;
			}
			return response;
		}
	}
	
	private String randomChoose(String a, String b, String c) {
		{
			final int NUMBER_OF_RESPONSES = 3;
			double r = Math.random();
			int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
			String response = "";
			
			if (whichResponse == 0)
			{
				response = a;
			}
			else if (whichResponse == 1)
			{
				response = b;
			}
			else if (whichResponse == 2)
			{
				response = c;
			}
			return response;
		}
	}
	
	private String randomChoose(String a, String b, String c, String d) {
		{
			final int NUMBER_OF_RESPONSES = 4;
			double r = Math.random();
			int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
			String response = "";
			
			if (whichResponse == 0)
			{
				response = a;
			}
			else if (whichResponse == 1)
			{
				response = b;
			}
			else if (whichResponse == 2)
			{
				response = c;
			}
			else if (whichResponse == 3)
			{
				response = d;
			}
			return response;
		}
	}
}
