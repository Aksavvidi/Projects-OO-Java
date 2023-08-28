package gr.aueb.cf.ch16.askisi2;

public class Circle extends AbstractShape implements ICircle{
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

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    /**
     *       The diameter of the circle 2 * r
     * @return
     */
    @Override
    public double getDiameter() {
        return radius * 2;
    }

    @Override
    public double getArea() { //εμβαδό
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getCircumference() {
        return Math.PI * (getDiameter());
        //εδώ επειδη το PI ειναι Final double να το βαλουμε και την περιμετρο double αντι για long?
    }
}
