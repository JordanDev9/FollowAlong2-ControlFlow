package part07;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4843s
//        rewatch 80:43–91:54 for logical operators and while loops
//
// In-class exercise — we do this together in class. Not graded, but commit it.
// The README (In-class exercise) has the steps and the output to match.

public class InClass {
    public static void main(String[] args) {

        // STEP 1 — we call our method here, then write a while loop together.
        int battery = 100;
        System.out.println("Can Drive? " + canDrive(100,false));
        //System.out.println("Can Drive? " + canDrive(80,false));
        //System.out.println("Can Drive? " + canDrive(80,true));
        //System.out.println("Can Drive? " + canDrive(10,false));




        // STEP 2 — fix the bugs. Each line below has ONE mistake.
        // Move ONE line at a time above the /* line, so Java sees it.
        // Read the red error. Fix it. Run it. Then do the next line.
        // the and logical opperator is && not and
        boolean inRange = battery > 20 && battery < 100;
        // you cannot just put battery once you have to put it for both conditions
        boolean almostFull = battery > 20 || battery < 100;
        // this just doesnt make any sense idek how to fix this
        // boolean ready = battery && true;

    }

    // STEP 1 (continued) — we write the canDrive method here, outside main.
    static boolean canDrive(int battery, boolean docked) {
        while(battery  >= 20){
            System.out.println("Driving... Battery " + battery + "%");
            battery = battery  - 25;
        }
        System.out.println("Stopped at " + battery + "%");


        return docked;
    }
}
