package part09;
import java.util.Random;
import java.util.Scanner;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo
//        (no video in this part — it is a checkpoint. Use it to look things up)
//
// In-class exercise — we do this together in class. Not graded, but commit it.
// The README (In-class exercise) has the steps.



public class InClass {
    public static void main(String[] args) {

        // STEP 1 — PLAN the guessing game together. No code yet.
        // Write each step of the game as a // comment, in plain English, in order.
        // 1.first i need to import random and get the cpu to get a random number from 1 to 100
        // 2.then i need to store that value into a variable so that i can create a if statement
        // 3.the if statement will compare if the number is higher or lower but i need to be about to count the trys
        //4. so ill need a while loop that has a if statement inside of it or i could make a function



        // STEP 2 — fix the bugs. Each bug below is inside its own /* ... */.
        // Do ONE bug at a time: delete its /* line and its */ line, so Java sees it.
        // Read the red error (or watch what happens). Fix it. Run it. Then do the next bug.

        // random didnt have () at the end and it needs it because its a method
        Random random = new Random();
        System.out.println("Random works: " + (random.nextInt(6) + 1));


        //the i in nextint should be a captial nextInt
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a number: ");
        int guess = scanner.nextInt();
        System.out.println("You typed " + guess);

        // this is a infinite loop because there is not step value for count so it will stay as 1 forever and the loop will keep running
        int count = 1;
        while (count <= 3) {
            System.out.println("Guess number " + count);
            count += 1;
        }

    }
}
