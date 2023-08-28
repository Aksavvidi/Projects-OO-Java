package gr.aueb.cf.ch11_12.pointproject.app;

import gr.aueb.cf.ch11_12.pointproject.model.Point;

public class Main {

    public static void main(String[] args) {
        Point point = new Point();
        //int abs = Math.abs(-20);

        point.setX(10);
        point.setY(20);

        System.out.println(point.pointToString());
    }
}
