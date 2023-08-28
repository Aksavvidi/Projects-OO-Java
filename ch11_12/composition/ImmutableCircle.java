package gr.aueb.cf.ch11_12.composition;

/**
 * Immutable Circle with mutable Point.
 */
public class ImmutableCircle {
    private final Point center;
    private final int radius;

    public ImmutableCircle() {
        center = new Point();
        radius = 0;
    }
    public ImmutableCircle(Point center, int radius){
        this.center = new Point(center.getX(), center.getY());
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }
    public String convertToString() {
        return "Center: " + center.pointToString() + "," + radius;
    }
}
