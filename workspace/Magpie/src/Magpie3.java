/**
 * A program to carry on conversations with a human user.
 * This version: 
 * <ul><li>
 *    Uses advanced search for keywords 
 * </li></ul> 
 *    
 * @author Laurie White
 * @version April 2012
 */
public class Magpie3
{
	/**
	 * Get a default greeting
	 * 
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
		if (statement.length() == 0)
		{
			response = randomChoose("I feel like i'm talking to myself", "Say something!", "This is worse than talking to a rock. Say something!");
		}
		else if (findKeyword(statement, "no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (findKeyword(statement, "your name") >= 0)
		{
			response = randomChoose("I was not given a name", "I don't have a name", "Names are overrated.");
		}
		else if (findKeyword(statement, "why") >= 0
				|| findKeyword(statement, "how") >= 0)
		{
			response = randomChoose("The universe has many wonders", "You should know the answer", "That is a wonder!");
		}
		else if (findKeyword(statement, "mr. gehringer") >= 0
				|| findKeyword(statement, "biggie g") >= 0)
		{
			response = "He sounds like a nice teacher.";
		}
		else if (findKeyword(statement, "cat") >= 0
				|| findKeyword(statement, "dog") >= 0)
		{
			response = randomChoose("Tell me more about your pets.", "I have a cat myself.");
		}
		else if (findKeyword(statement, "nathan") >= 0)
		{
			response = "Nathan must be a nice guy!";
		}
		else if (findKeyword(statement, "mother") >= 0
				|| findKeyword(statement, "father") >= 0
				|| findKeyword(statement, "sister") >= 0
				|| findKeyword(statement, "brother") >= 0)
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
	 * Search for one word in phrase. The search is not case
	 * sensitive. This method will check that the given goal
	 * is not a substring of a longer string (so, for
	 * example, "I know" does not contain "no").
	 *
	 * @param statement
	 *            the string to search
	 * @param goal
	 *            the string to search for
	 * @param startPos
	 *            the character of the string to begin the
	 *            search at
	 * @return the index of the first occurrence of goal in
	 *         statement or -1 if it's not found
	 */
	private int findKeyword(String statement, String goal,
			int startPos)
	{
		String phrase = statement.trim().toLowerCase();
		goal = goal.toLowerCase();

		// The only change to incorporate the startPos is in
		// the line below
		int psn = phrase.indexOf(goal, startPos);

		// Refinement--make sure the goal isn't part of a
		// word
		while (psn >= 0)
		{
			// Find the string of length 1 before and after
			// the word
			String before = " ", after = " ";
			if (psn > 0)
			{
				before = phrase.substring(psn - 1, psn);
			}
			if (psn + goal.length() < phrase.length())
			{
				after = phrase.substring(
						psn + goal.length(),
						psn + goal.length() + 1);
			}

			// If before and after aren't letters, we've
			// found the word
			if (((before.compareTo("a") < 0) || (before
					.compareTo("z") > 0)) // before is not a
											// letter
					&& ((after.compareTo("a") < 0) || (after
							.compareTo("z") > 0)))
			{
				return psn;
			}

			// The last position didn't work, so let's find
			// the next, if there is one.
			psn = phrase.indexOf(goal, psn + 1);

		}

		return -1;
	}

	/**
	 * Search for one word in phrase. The search is not case
	 * sensitive. This method will check that the given goal
	 * is not a substring of a longer string (so, for
	 * example, "I know" does not contain "no"). The search
	 * begins at the beginning of the string.
	 * 
	 * @param statement
	 *            the string to search
	 * @param goal
	 *            the string to search for
	 * @return the index of the first occurrence of goal in
	 *         statement or -1 if it's not found
	 */
	private int findKeyword(String statement, String goal)
	{
		return findKeyword(statement, goal, 0);
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * 
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
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
