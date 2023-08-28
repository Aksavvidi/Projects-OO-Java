package gr.aueb.cf.ch16.askisi2;

public class Line extends AbstractShape implements ILine{
    private double length;

    public Line () {}

    public Line(double length) {
        this.length = length;
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
    public double getLength() {
        return length;
    }
}
