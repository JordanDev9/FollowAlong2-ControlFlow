package part07;
import java.util.Scanner;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4843s
//        logical operators start at about 80:43 — stop at about 87:47
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 07 — the logical operators: && (and), || (or), ! (not)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called LogicalOperators.
//    Leave the "package part07;" line and the "public class LogicalOperators" line alone.
//    The import line goes BETWEEN them (the guide shows where).
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class LogicalOperators {
    public static void main(String[] args) {
        // this sets the value of temp to 25
        int temp = 25;
        // this line ask if temp is greater than 30
        if (temp > 30) {
            // if it is this line of code will execute printing whats inside the quotes
            System.out.println("Its hot outside");
            // if its not true it will ask else if temp is greater than or equal to 20 and temp is less than or equal to 30
        } else if(temp >= 20 && temp <= 30){
            // if both are true this line will excute printing whats insde the quotes
            System.out.println("Its warm outside");
            // this line ask if temp is anything else than do
        }else{
            // whatever is inside the qutoes because this is the last case scernario with no conditions
            System.out.println("Its cold outside ");
        }
        // this line creates the scanner object
        Scanner scanner = new Scanner(System.in);
        // this line prints out whats inside the quotes and is used to ask for a user input
        System.out.println("You are playing a game! Press q or Q to quit");
        // this line stores the user input inside of the variable respones
        String response = scanner.next();
        // this line ask if respones is equal to q or Q
        if (response.equals("q") || response.equals("Q")) {
            // if it does then this lines prints whats inside the qutoes
            System.out.println("You quit the game");
            // this line says if it doesnt equal q or Q then do
        } else {
            // whatever is inside the quotes because this is the last case scenario with no conditions
            System.out.println("You are still playing the game *pew pew*");
        }
    }

}
