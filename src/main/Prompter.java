//Packages to be imported
import java.lang.String;
import java.lang.System;
import java.io.Console;

public class Prompter {
    //This prompter object will do all the input/output of program

    //Member variable
    private mGame;

    public Prompter(Game game) {
    //Set the member variable equal to what is passed in the Prompter object
        mGame = game;
    }//ends Prompter constructor

    //Prompter object prompts for a guess
    public boolean promptForGuess() {
        //Console object is imported from java.io.Console
        Console console = System.console();
        //Get the string back from what the user guesses
        String guessAsString = console.readLine("Enter a letter:  ");
        //Get first character of whatever they guessed
        char guess = guessAsString.charAt(0);
        //Pass what Game object returns for that first char
        return mGame.applyGuess(guess);


    }//Ends promptForGuess


}//Ends Prompter class