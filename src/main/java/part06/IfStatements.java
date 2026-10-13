package part06;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4128s
//        if statements start at about 68:48 — stop at about 74:54
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 06 — if, else if, else
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called IfStatements.
//    Leave the "package part06;" line and the "public class IfStatements" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class IfStatements {
    public static void main(String[] args) {
        //the line below assigns in age to 13
        int age = 13;
        // the line below ask if then has a conditional statement in parentheses age greater than or equal to 75
        if (age >= 75) {
            // if the line about is true the this line of code will excute printing out Ok boomer
            System.out.println("OK boomer!");
            /* this line goes along with the if statement but says else if which is the same as if but this has
            a different conditonal this says if age greater than of equal to 18 this is excuted after asking if its
            greater than 75 because if we did this first you could be 55 and be called an adult and we wouldnt get to
            ok boomer
             */
        } else if (age >= 18) {
            // if the line above is true this line will print you are an adult
            System.out.println("You are an adult!");
            //this line checks to see if you are older or equal to 13
        } else if (age >= 13) {
            //if the line above is true then this line will print out you are a teenager
                System.out.println("You are a teenager!");
                //else mean that if none of these apply then this is the last case scenario
        } else {
            // and if we reach the last case scenario then this line will print you are not an adult
            System.out.println("You are not an adult!");
        }
    }
}
