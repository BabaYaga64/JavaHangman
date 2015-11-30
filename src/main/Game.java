import java.lang.String;

public class Game {
    public static void main(String[] args) {
        public static final int MAX_MISSES = 7;
        private String mAnswer;
        //This parameter stores the correct guesses
        private String mHits;
        //This parameter stores the incorrect guesses
        private String mMisses;

        //Constructor forces an answer every time in the game.
        public Game(String answer) {
            //Member variable shows what user entered
            mAnswer = answer;
            //Both have a brand new state
            mHits = "";
            mMisses = "";

        }//Ends Game constructor

        //This method allows users to apply a guess towards the puzzle

    public boolean applyGuess(char letter) {
        //This value determines if it is a hit or not by looking inside their answer and seeing if that letter exists
        boolean isHit = mAnswer.indexOf(letter) >= 0;
        //If there is a correct guess, then increment isHit variable
        if (isHit) {
            mHits += letter;
        } else {
            //If there is an incorrect guess, then increment misses
            mMisses += letter;

        }//End else statement

        return isHit;
    }

    //Displays current progress of the guesses - dashes for unguessed letters, and the letter for guessed letters.
    public String getCurrentProgress() {
        //Start with an empty string
        String progress = "";
        //Loop through each of the letters in the answer
        for (char letter: mAnswer.toCharArray()) {
            char display = '-';
            if (mHits.indexOf(letter) >= 0) {
                display = letter;
            }//End if statement
            progress += display;
        }//End for loop
        return progress;
    }//End getCurrentProgress

    public int getRemainingTries() {
        return MAX_MISSES - mMisses.length();

    }//End getRemainingTries

    }//Ends main method
}//Ends Game class