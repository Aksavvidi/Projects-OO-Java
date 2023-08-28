package gr.aueb.cf.ch15;

public class Point {
    private double x;

    public Point() {}

    public Point(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }
//    public String convertToString() {
//        return "(" + x + ")";
//    }

    @Override
    public String toString() {
        //return super.toString(); //διευθυνση μνημησ του point που την καλει
        return "(" + x + ")";
    }
    /**
     * η μέθοδος getDistanceFromOrigin επιστρέφει την απόσταση του σημείου από την αρχή των αξόνων, η οποία είναι η απόλυτη τιμή του x.
     */

    public double getDistanceFromOrigin() {
        return Math.abs(x);
    }
    /**
     * @implSpec
     *
     */
    public void movePlus10() {
        // x += 10;

        //Self-use of movePlusOne
        for (int i = 1; i <= 10; i++) {
            movePlusOne();
        }
    }
    protected void movePlusOne() {
        x += 1;
    }
    protected void printTypeOf() {
        System.out.println(this.getClass().getSimpleName());
    }
    private  void reset() {
        x = 0;
    }
}
