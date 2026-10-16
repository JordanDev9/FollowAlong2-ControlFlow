package part08;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=5591s
//        rewatch 1:33:11 (for loops) and 1:38:52 (nested loops) if you get stuck
// Guide: GUIDE.md in this folder
//
// SECTION D — Challenge. Two small methods. A test checks them: src/test/java/part08/ChallengeTest.java
// Run the test with the green arrow next to "class ChallengeTest". Do NOT change the test.
//
// Each method already has its top line. The inputs are in the parentheses.
// Replace the line marked YOUR CODE so the method returns the right answer.

public class Challenge {
    public static void main(String[] args) {
        System.out.println(repeatWord("hi", 3));
        System.out.println(repeatWord("Go", 1));
        System.out.println(repeatWord("abc", 0));
        System.out.println(triangle(3));
        System.out.println(triangle(5));
    }

    // Repeat word n times, all stuck together.
    // repeatWord("hi", 3)   should return "hihihi"
    // repeatWord("Go", 1)   should return "Go"
    // repeatWord("abc", 0)  should return ""   (zero times = an empty String)
    public static String repeatWord(String word, int n) {
        String black = "";
        for (int count = 1; count <= n; count++){
            black += word;
        }
        return black;
    }

    // Build a triangle of stars with the given number of rows.
    // Row 1 has 1 star, row 2 has 2 stars, and so on. Every row ends with \n.
    // triangle(3) should return "*\n**\n***\n"   which prints as:
    //     *
    //     **
    //     ***
    // triangle(0) should return ""
    public static String triangle(int rows) {
        String res = "";

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i; j++) {
                res += "*";
            }

            res += "\n";
        }
        return res;
    }

    }

