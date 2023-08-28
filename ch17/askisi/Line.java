package gr.aueb.cf.ch17.askisi;

import java.io.Serializable;
import java.util.Objects;

public class Line extends AbstractShape implements Serializable, Cloneable {
     private double length;

     public Line () {}

    public Line(double length) {
        this.length = length;
    }

    // Copy constructor
    public Line(Line other) {
        this.length = other.length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Line{" +
                "length=" + length +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Double.compare(line.length, length) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
