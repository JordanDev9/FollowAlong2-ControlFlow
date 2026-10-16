package part09;
import java.util.Random;
import java.util.Scanner;
// Part 09 — CHECKPOINT. No video in this part.
// Video (only if you need a reminder): https://www.youtube.com/watch?v=xk4_1vDrzzo
//   user input (Scanner) — part 03 · random numbers — part 05
//   if statements — part 06 · while loops — part 07
//
// SECTION A — BUILD: write a number guessing game in this class, starting from nothing.
//    The README has the full list of rules and a sample run.
//    Leave the "package part09;" line and the class line alone. Type everything else,
//    including main and the import lines.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.

public class GuessingGame {
    public static void main(String[] args){
        // this creates the random object allow us to get random numbers
        Random random = new Random();
        // this creates the scanner object to allow user inputs
        Scanner scanner = new Scanner(System.in);
        // this line genereates a random number between 1 and 100 and stores it in the variable num
        int num = random.nextInt(101);
        // this line print whats inside the quotes and is a message explaining the game
        System.out.println("Im thinking of a number between 1 and 100");
        // this just sets a default value for your guess so that we can use it during the while loop
        int yourGuess = 0;
        // this line sets a value fo count so we cn track the amount of attempts it takes to guess the number
        int count = 1;
        // this is the loop that allow you to keep guessing the number because the loop doesnt stop until your guess is equal to num
        while(yourGuess != num){
            // this line is used to tell the user what to input
            System.out.println("Enter your Guess: ");
            // this line takes the user input and stores it the variable your guess
            yourGuess = scanner.nextInt();
            // this line says that if your guess if less the num
            if (yourGuess < num){
                // then you need to guess a higher number which is why this line prints higher
                System.out.println("Higher");
                // this line says if your guess is higher than num then
            }else if (yourGuess > num){
                // your guess needs to be a lower number which is why this line print lower
                System.out.println("Lower");

            }
            //this line is inside the while loop but outside the if statements to count the amount of tries
            count += 1;
        }
        /*
       
        System.out.println("You guess correct the number is " + num);
        System.out.println("It took you " + count + " attempts");
    }

}
