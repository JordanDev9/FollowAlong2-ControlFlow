package part08;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=5557s
//        starts at 1:32:37 — stop at about 1:36:20, before "if you would like a copy"
// Guide: GUIDE.md in this folder, steps 1–5
//
// Part 08 — for loops
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called ForLoops.
//    Leave the "package part08;" line and the class line alone. Type everything else.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class ForLoops {
    public static void main(String[] args) {
        /* this line is a loop that starts at i = o
        will stop when i = 10 and increments by 1 every interation
         */
        for (int i = 0; i <= 10; i++) {
            // this line prints i everytime the loop goes around
            System.out.println(i);
        }
        /* this code does the same as the other one expect
        it starts at 10 and goes down to zero
         */
        for (int i = 10; i >= 0; i--) {
            // this line prints i everytime the loop goes around
            System.out.println(i);
        }
        // this line of code prints happy new years because the loop  before acts as a countdown so it makes it cool
        System.out.println("Happy New Year!");
        // this is a loop that doesnt have a incrementation or decreatation in the for statment its step is in the loop itself and goes down by 2
        for (int i = 10; i >= 0;) {
            // this line prints i everytime the loop goes around
            System.out.println(i);
            // this line means that i now equals i - 2 which makes the loop do less iterations
            i -= 2;
        }
        // this line prints happy new year
        System.out.println("Happy New Year!");

        }
    }




