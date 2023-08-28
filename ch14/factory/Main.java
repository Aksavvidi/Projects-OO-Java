package gr.aueb.cf.ch14.factory;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Point p1 = Point.getZeroPoint();
        Point p2 = Point.getRandomPoint();

        System.out.println(p1.pointToString());
        System.out.println(p2.pointToString());
    }
}
