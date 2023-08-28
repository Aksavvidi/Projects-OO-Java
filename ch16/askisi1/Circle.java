package gr.aueb.cf.ch16.askisi1;

public class Circle extends AbstractShape implements ITwoDimensional{
    private double radius;

    public Circle () {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override// εμβαδό
    public double getArea() {
        return  2* Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
