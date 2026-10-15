package part08;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=5557s
//        rewatch for loops (about 1:32:37) and nested loops (about 1:37:16)
//
// In-class exercise — we do this together in class. Not graded, but commit it.
// The README (In-class exercise) has the steps and the output to match.

public class InClass {
    public static void main(String[] args) {

        // STEP 1 — we build the sensor sweep and the parking map together, here.
        int angle = 0;
        int I;
        System.out.println("=== SENSOR SWEEP ===");
        for (I = 1; I <= 5; I++){
            System.out.println("Scanning at " + angle + " degress");
            angle = angle + 45;
        }
        System.out.println("=== PARKING MAP ===");
        for (int j = 1; j <= 3; j++){
            System.out.print("Row" + j + " :");
            for(int J = 1; J < 5; J++){
                System.out.print("[ ]");
            }
            System.out.println();
        }




        // STEP 2 — fix the bugs. Each bug below is inside its own /* ... */.
        // Do ONE bug at a time: delete its /* line and its */ line, so Java sees it.
        // Read the red error. Fix it. Run it. Then do the next bug.

        // the issue is they are using commas instead of semi colons
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }


        // this issue is i is already definded and it also never prints a newline
        for (int m = 1; m <= 3; m++) {
            System.out.println();
            for (int d = 1; d <= 4; d++) {
                System.out.print("[ ]");
            }
            System.out.println();
        }

        // angle is previouly definded above so we dont need to say int because that would be creating another angle and you cant
        for (angle = 0; angle <= 180; angle += 45); {
            System.out.println("Scanning at " + angle + " degrees");
        }
    }
}
