import java.util.*;
public class Guessing_number {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String play = "yes";

        while (play.equals("yes")) {
            Random rand = new Random();
            int randnum = rand.nextInt(100);
            int guess = -1;
            int tries = 0;
            while (guess != randnum) {

                System.out.print("Guess a number between 1 and 100: ");
                guess = scan.nextInt();
                tries++;
                if (guess == randnum){
                    System.out.print("Awesome! You guessed the number! ");
                    System.out.println("You take the "+ tries + "chance to guess the right number:");
                    System.out.print("Would you like to play again ? Yes or No : -");
                    play= scan.next().toLowerCase();
                } else if (guess > randnum) {
                    System.out.print("Your guess is too high, please try again. ");
                }
                else {
                    System.out.print("your Guess is too low, try again ");
                }
            }
        }
        scan.close();
    }
}
