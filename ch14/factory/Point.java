package gr.aueb.cf.ch14.factory;

import java.util.Random;

/**
 * Point Java Bean
 */
public class Point {
    private double x;

    public Point() {} //default constructor (default γτ δεν εχει παραμετρυς μεσα στις παρενθεσεις.

    public Point(double x) {
        this.x = x; //το this εννοει της κλασης  το x (του instance το x) = me x το χ που του δίνω εγω ( inject to constructor για να αρχικοποιηση το instance)
    }

    /**
     * A static factory that returns
     * a (0, 0) new Point
     *
     * @return  a new (0, 0) point
     */
    public static Point getZeroPoint(){
        return new Point();
    }

    /**
     * A static factory that returns a random point
     * between 0-100
     *
     * @return a random point between 0-100
     */
    public static Point getRandomPoint(){
        Random rnd = new Random(System.currentTimeMillis());//τρεχουσα milsec απο τον υπολογιστη, με αυτο πετυχαίνω διαφορετικουσ αριθμους καθε φορα για την random
        return new Point(rnd.nextDouble()* 101);//επιστρέφει στο φασμα 0 - 100
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }
    public String pointToString(){
        return "(" + x + ")";
    }
    public void movePlus10() {
        // x += 10;

        //Self-use of movePlusOne
        for (int i = 1; i<= 10; i++) {
            movePlusOne();
        }
    }

    protected void movePlusOne() {
        x++;
    }

    protected void printTypeOf() {
        System.out.println(this.getClass().getSimpleName());
    }

    private void reset() {
        x = 0;
    }
}
