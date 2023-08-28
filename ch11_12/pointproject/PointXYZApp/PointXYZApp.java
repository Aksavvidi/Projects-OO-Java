package gr.aueb.cf.ch11_12.pointproject.PointXYZApp;

public class PointXYZApp {

    public static void main(String[] args) {

        PointXYZ p = new PointXYZ();

        p.setX(10);
        p.setY(20);
        p.setZ(15);

        System.out.println("Point(x,y,z)= " + p.convertToString());


    }
}
