import java.util.Random;
import java.util.Scanner;

class HighLow {
    // Method to play one turn of the game
    public static boolean playTurn(int numGuesses, int hiddenNum) {
        Scanner scanner = new Scanner(System.in);

        for (int guessCount = 1; guessCount <= numGuesses; guessCount++) {
            System.out.print("Enter your guess (1-100): ");
            int playerGuess = scanner.nextInt();

            if (playerGuess < hiddenNum) {
                System.out.println("Guess higher!");
            } else if (playerGuess > hiddenNum) {
                System.out.println("Guess lower!");
            } else {
                return true; // Player guessed correctly
            }
        }

        return false; // Player used all their guesses without guessing correctly
    }

    // Method to generate a random number within a given range
    public static int getRandomNumberUsingNextInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}
