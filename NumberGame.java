package Task1;
import java.util.Scanner;


public class NumberGame {

    public static void main(String[] args) {

        // Generate a random number between 1 and 100 range
        int randomNumber = (int) (Math.random() * 100) + 1;

        // Create a Scanner sc object to read user input

        Scanner sc = new Scanner(System.in);

        // Start the game loop
        boolean guessedCorrectly = false;
        int numberOfAttempts = 0;
        System.out.println("Guess a number between 1 and 100: "
                + "\nSystem Generated Number is " + randomNumber);


        while (!guessedCorrectly && numberOfAttempts < 5) {
            // Ask the user to guess a number

            // the user's guess
            System.out.print("guess the no:");
            int userGuess = sc.nextInt();

            // Check if the user guessed correctly or not
            if (userGuess == randomNumber) {
                guessedCorrectly = true;
            } else {
                numberOfAttempts++;
                if (userGuess > randomNumber) {
                    System.out.println("Your guess is too high.");
                } else {
                    System.out.println("Your guess is too low.");
                }
            }
        }

        sc.close();

        // If the user guessed correct, congratulate them. Otherwise, tell them the correct answer.
        if (guessedCorrectly) {
            System.out.println("Congratulations! You guessed correctly! The number was " + randomNumber);
        } else {
            System.out.println("Sorry, you guessed wrong. The correct answer was " + randomNumber);
        }
    }
}
