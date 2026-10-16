package part08;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=5591s
//        rewatch 1:33:11–1:36:00 for the three parts of a for loop
// Guide: GUIDE.md in this folder, steps 2–5 and 8
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.
/* this code will print
1 2 3 then i is 5 i is 3 i is 1 then ***
                                     ***
 */
public class Stretch {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 5; i > 0; i -= 2) {
            System.out.println("i is " + i);
        }
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int b = 5;
        while (b > 0) {
            System.out.println(b);
            b = b - 1;
        }
        System.out.println("Liftoff!");
        for (int A = 2; A <= 20; A = A + 2){
            System.out.println(A);
        }
        int row;
        int col;
        for (row = 1; row <= 5; row++){
            for (col = 1; col <=5; col++){
                System.out.print(row * col + "\t");
            }
            System.out.println();
        }
    }

}
