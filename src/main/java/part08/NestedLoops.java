package part08;
import java.util.Scanner;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=5836s
//        starts at 1:37:16 — stop at about 1:42:48, at "well ladies and gentlemen"
// Guide: GUIDE.md in this folder, steps 6–10
//
// Part 08 — nested loops (a loop inside another loop)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called NestedLoops.
//    Leave the "package part08;" line and the class line alone. Type everything else.
//    When you type Scanner, IntelliJ will want an import. See the README.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class NestedLoops {
    public static void main(String[] args) {
        // this line creates the scanner object
        Scanner scanner = new Scanner(System.in);
        // this line creates and int variable called rows
        int rows;
        // this line creates a int variable called collums
        int columns;
        // this lines creates a string variable called symbol
        String symbol = "";
        // this line prints enter a number of rows and will be used to ask the user for a input
        System.out.println("Enter number of rows:");
        // this is how we ask the user for a input using scanner
        rows = scanner.nextInt();
        // the same thing as before printing out a statment that will be used for a user input
        System.out.println("Enter number of columns:");
        // this is how we get the input
        columns = scanner.nextInt();
        // another user input
        System.out.println("Enter symbol to use:");
        // and how we access the input
        symbol = scanner.next();
        // this is a for loop that starts at i = 1 the loop stops when i equals the amount of rows and i increaments by 1 every interation
        for (int i = 1; i <= rows; i++) {
            // this prints out a new line everytime this step is done
            System.out.println();
            /* this is a for loop nested inside of another
            j = 1 and this loop stops when j equals collums
             */
            for (int j = 1; j <= columns; j++) {
                // this prints symbol everytime this line executes
                System.out.print(symbol);
            }
        }

    }

}
