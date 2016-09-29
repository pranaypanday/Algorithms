import java.io.*;
import java.util.Random;

/**
 * Random guessing player.
 * This player is for task B.
 *
 * You may implement/extend other interfaces or classes, but ensure ultimately
 * that this class implements the Player interface (directly or indirectly).
 */


public class RandomGuessPlayer implements Player
{
	private String Player1;
	private String player2;
	private String[] hairLength,glasses,facialHair,eyeColor,pimples,hatwhite,hairColor,noseShape,faceShape;;
	private int randomattr;
	private int randomvalue;
    /**
     * Loads the game configuration from gameFilename, and also store the chosen
     * person.
     *
     * @param gameFilename Filename of game configuration.
     * @param chosenName Name of the chosen person for this player.
     * @throws IOException If there are IO issues with loading of gameFilename.
     *    Note you can handle IOException within the constructor and remove
     *    the "throws IOException" method specification, but make sure your
     *    implementation exits gracefully if an IOException is thrown.
     */
    public RandomGuessPlayer(String gameFilename, String chosenName)
        throws IOException
    {
    	File chosenPlayerFile;
    	File currentFile;
    	chosenPlayerFile = new File(chosenName);
    	currentFile = new File(gameFilename);
    	String playerName;
    	File newFileName;
    	hairLength = new String[] {"white","yellow","green","red","blue","brown","black"};
    	glasses = new String[] {"green","yellow"};
    	facialHair = new String[] {"white","yellow","blue","red"};
    	eyeColor = new String[]{"brown","blue", "green"};
    	pimples = new String[]{"white","yellow","green","red","blue","brown","black"};
    	hatwhite = new String[]{"yellow","green","red","blue","brown","black"};
    	hairColor = new String[]{"white","black","brown","red","blue"};
    	noseShape = new String[] {"white","yellow","green","red","black"};
    	faceShape = new String[] {"white","black","green","red","blue","brown"};
    	
    	if(!gameFilename.isEmpty() || !chosenName.isEmpty()){
    		return;
    	}
    	
    } // end of RandomGuessPlayer()


    public Guess guess() {
    	Random rand = new Random();
    	randomattr = rand.nextInt(0);
    	randomvalue = rand.nextInt(1);
    	
        // placeholder, replace
        return new Guess(Guess.GuessType.Person, "", "Placeholder");
    } // end of guess()


    public boolean answer(Guess currGuess) { 
    	
        // placeholder, replace
        return false;
    } // end of answer()


	public boolean receiveAnswer(Guess currGuess, boolean answer) {
		if(answer==true){
			// remove element from the array
			// and store it in a new created array
			return true;
		}
		else
		{
			return false;
		}
        // placeholder, replace
       
    } // end of receiveAnswer()

} // end of class RandomGuessPlayer
