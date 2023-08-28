package gr.aueb.cf.ch17.askisi;

import java.io.Serializable;
import java.util.Objects;

public class Circle extends AbstractShape implements ITwoDimensional, Serializable, Cloneable {
    private double radius;

    public Circle () {}

    public Circle(double radius) {
        this.radius = radius;
    }

    // Copy constructor
    public Circle(Circle other) {
        this.radius = other.radius;
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
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }
    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
