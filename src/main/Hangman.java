public class Hangman {

    public static void main(String[] args) {
        Game game = new Game("treehouse");

        //Create a new Prompter object that takes a Game object
        Prompter prompter = new Prompter(game);
        prompter.play();
    }//Ends main method
}//Ends Hangman class
