package part07;
import java.util.Scanner;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=5302s
//        while loops start at about 88:22 — stop at about 91:54
// Guide: GUIDE.md in this folder, steps 7–11
//
// Part 07 — while loops and do-while loops
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called WhileLoops.
//    Leave the "package part07;" line and the "public class WhileLoops" line alone.
//    The import line goes BETWEEN them (the guide shows where).
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.
//
// If your program never stops: click the red square (Stop) in the Run window.

public class WhileLoops {
    public static void main(String[] args) {
        // this line creates scanner so that we can get user inputs
        Scanner scanner = new Scanner(System.in);
        // this line assigns a empty string to the variable name
        String name = "";
        // this line creates a loop with the function is blank so while something is blank the loop repeats
        while (name.isBlank()) {
            // this line is printing out what is inside the quotes but we use this to ask for a user input
            System.out.print("Enter your name: ");
            // this line takes the user input and stores in into a variable in this case the variable is name
            name = scanner.nextLine();
        }
        // this line prints hello and whatever the user inputed name is
        System.out.println("Hello " + name);
        // this a do while loop
        do {
            // tnhis line ask for a user input enter your name:
            System.out.print("Enter your name: ");
            // this line takes the user input and stores it in a variable called name
            name = scanner.nextLine();
            // this is the condition that makes it do while (whatever the condition is) and in this case its .isblank()
        } while (name.isBlank());
    }

}
