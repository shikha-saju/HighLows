public class Main {
    public static void main(String[] args) {
        // Initialize variables
        int numGuesses = 6; // Number of guesses allowed
        int hiddenNum = HighLow.getRandomNumberUsingNextInt(1, 101); // Random number between 1 and 100

        System.out.println("Welcome to the High-Low Game!");
        System.out.println("Try to guess the hidden number between 1 and 100.");

        // Play the game
        boolean isGuessed = HighLow.playTurn(numGuesses, hiddenNum);

        // Check if the player guessed correctly
        if (isGuessed) {
            System.out.println("Congratulations! You guessed the number correctly.");
        } else {
            System.out.println("Sorry, you couldn't guess the number. The hidden number was: " + hiddenNum);
        }
    }
}