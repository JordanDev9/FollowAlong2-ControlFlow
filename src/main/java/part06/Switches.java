package part06;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4525s
//        switches start at about 75:25 — stop at about 80:18
// Guide: GUIDE.md in this folder, steps 7–11
//
// Part 06 — switch, case, break, default
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Switches.
//    Leave the "package part06;" line and the "public class Switches" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.

public class Switches {
    public static void main(String[] args) {
        //this assignsn the string value of pizza to the variable day
        String day = "Pizza";
        //this is a switch statement that will ask in regards of day
        switch (day) {
            // this line is asking if day is sunday
            case "Sunday":
                //if this is true then line will print what is in the quotes
                System.out.println("It is Sunday");
                // break ends the case until a new one is started without it once the day is found the code would keep running
                break;
            case "Monday":
                //if this is true then line will print what is in the quotes
                System.out.println("It is Monday");
                // break ends the case until a new one is started without it once the day is found the code would keep running
                break;
            case "Tuesday":
                //if this is true then line will print what is in the quotes
                System.out.println("It is Tuesday");
                // break ends the case until a new one is started without it once the day is found the code would keep running
                break;
            case "Wednesday":
                //if this is true then line will print what is in the quotes
                System.out.println("It is Wednesday");
                // break ends the case until a new one is started without it once the day is found the code would keep running
                break;
            case "Thursday":
                //if this is true then line will print what is in the quotes
                System.out.println("It is Thursday");
                // break ends the case until a new one is started without it once the day is found the code would keep running
                break;
            case "Friday":
                //if this is true then line will print what is in the quotes
                System.out.println("It is Friday");
                // break ends the case until a new one is started without it once the day is found the code would keep running
                break;
            case "Saturday":
                //if this is true then line will print what is in the quotes
                System.out.println("It is- Saturday");
                // break ends the case until a new one is started without it once the day is found the code would keep running
                break;
            default:
                // default means if all of the above are false then this is what will print
                System.out.println(day + " is not a day");
        }
    }

}
