package main;

public class Game {
    private String mAnswer;
    //This parameter stores the correct guesses
    private String mHits;
    //This parameter stores the incorrect guesses
    private String mMisses;

    //Constructor forces an answer every time in the game.
    public Game (String answer) {
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

}//Ends Game class