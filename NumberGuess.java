import java.util.*;

public class NumberGuess {
  public static void main(String[] args) {
    
    // Create a random number generator
    Random randomGenerator = new Random();    
    String guess;
    int guessCount = 0;
    
    System.out.print("Try to guess a number between 1 and 100. To exit, type 'quit': ");
    int numberToGuess = randomGenerator.nextInt(100) + 1;
    
    // Main game loop
    while(true) {
      
      // Get the user's guess
      guess = System.console().readLine();
      
      // Check for an exit condition
      if(guess.equals("quit")) {
        System.out.println("Okay, bye!");
        break;
      }
      
      // Convert guess from string to integer
      int guessNumber = Integer.valueOf(guess).intValue();
      guessCount++;
      
      if(guessNumber > numberToGuess) {
        System.out.print("Your guess is too high. Try again: ");
      }
      else if(guessNumber < numberToGuess) {
        System.out.print("Your guess is too low. Try again: ");
      }
      else {
       System.out.print("Congratulations the number was: ");
       System.out.println(numberToGuess);
       System.out.printf("You guessed it in: %d guesses. Thanks for playing. Goodbye.\n", guessCount);
       break;
      }
    }
  }
} 
