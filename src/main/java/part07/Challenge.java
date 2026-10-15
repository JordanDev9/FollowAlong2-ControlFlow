package part07;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4895s
//        logical operators start at about 81:35, while loops at about 89:11
// Guide: GUIDE.md in this folder
//
// SECTION D — Challenge. Two small problems. A test checks them for you:
// src/test/java/part07/ChallengeTest.java
//
// The top line of each problem is given to you. The inputs are already in the
// variables inside the ( ). Replace ONLY the line marked YOUR CODE.
// Your answer goes after the word return. You may add more lines above it.

public class Challenge {
    public static void main(String[] args) {
        System.out.println(digitCount(7));
        System.out.println(digitCount(42));
        System.out.println(digitCount(999));
        System.out.println(digitCount(12345));
        System.out.println(digitCount(0));


        // Problem 1 — canPlay
        // You can play video games if your homework is done OR it is the weekend,
        // AND the hour is from 8 up to (but not including) 21.
        // Hours use a 24-hour clock: 8 is 8 AM, 20 is 8 PM, 21 is 9 PM.
        //
        System.out.println(canPlay(true, false, 10));
        System.out.println(canPlay(false, true, 20));
        System.out.println(canPlay(false, false, 15));
        System.out.println(canPlay(true, true, 21));
        System.out.println(canPlay(true, false, 7));
    }

    public static boolean canPlay(boolean homeworkDone, boolean isWeekend, int hour) {
        if ((homeworkDone || isWeekend) && hour > 7 && hour < 21) {
            return true;
        } else {
            return false;
        }
    }

        // Problem 2 — digitCount
        // Return how many digits n has. n is never negative. 0 has 1 digit.





    //
    // Hint: n / 10 chops off the last digit. 12345 / 10 is 1234.
    // Use a while loop that keeps chopping and counts how many times.
    public static int digitCount(int n) {
        int i = 1;
        while((n >= 10)){
            n = n / 10;
            i++;
        }
        return i;
    }
}

