import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/* Generating the random number and 
		making sure it is not 0 because nextInt 
		method includes 0 */
		Random rand = new Random();
		int answer = rand.nextInt(100);
		while (answer == 0) {
			answer = rand.nextInt(100);
		}
	
		int guesses = 0;
		int attempts = 0;
		
		System.out.println("Welcome to the Number Guessing Game!");
		System.out.println("I'm thinking of a number between 1 and 100.");

		System.out.print("\nPlease select the difficulty level:\n"
				+ "1. Easy (10 chances)\n"
				+ "2. Medium (5 chances)\n"
				+ "3. Hard (3 chances)\n"
				+ "0. Exit!\n> ");
		
		
		Scanner sc = new Scanner(System.in);
		String difficulty = sc.next();
		
		
		int convertedInt = Integer.parseInt(difficulty);
		
		if (convertedInt == 1) {
			guesses = 10;
			System.out.println("\nGreat! You have selected Easy mode. You have " + guesses + " guesses left.");
		} else if (convertedInt == 2) {
			guesses = 5;
			System.out.println("\nGreat! You have selected Easy mode. You have " + guesses + " guesses left.");
		} else if (convertedInt == 3) {
			guesses = 3;
			System.out.println("\nGreat! You have selected Easy mode. You have " + guesses + " guesses left.");
		} else if (convertedInt == 0) {
			System.exit(0);
		}
		
		
		System.out.println("Lets start the game!\n");
		while (guesses != 0) {
			System.out.print("Enter your guess: ");
			int input = sc.nextInt();
			if (input != answer) {
				if(input > answer) {
					System.out.println("Incorrect! The number is less than " + input + "\n");
				} else {
					System.out.println("Incorrect! The number is greater than " + input + "\n");
				}
				guesses -= 1;
				attempts += 1;
			} else {
				System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
				sc.close();
				break;
			}
		}
		if (guesses >= 0) {
			System.out.println("You have ran out of attempts. The number was " + answer + " Try again later.");
		}
		
		
	}

}
