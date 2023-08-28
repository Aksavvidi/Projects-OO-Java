package gr.aueb.cf.ch15;

public class PointUtil {
    public static double distanceFromOrigin(Point point) {
        return point.getDistanceFromOrigin();
    }

    public static void main(String[] args) {
        Point point = new Point(3.0);
        Point2D point2D = new Point2D(4.0, 5.0);
        Point3D point3D = new Point3D(1.0, 2.0, 3.0);

        System.out.println("Distance from origin (Point): " + distanceFromOrigin(point));
        System.out.println("Distance from origin (Point2D): " + distanceFromOrigin(point2D));
        System.out.println("Distance from origin (Point3D): " + distanceFromOrigin(point3D));
    }
}



