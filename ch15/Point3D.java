package gr.aueb.cf.ch15;


public class Point3D extends Point2D {
    private double z;

    public Point3D() {
        super();//το JVM προσθετει απο μονο του την super()
    }

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public Point3D(double z) {
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
//    @Override
//    public String convertToString() {
//        return "(" + this.getX() + "," +this.getY() + ","
//                + z + ")";
        //return super.convertToString() + "(" + z + ")";
 //   }

    @Override
    public String toString() {
        return "(" + this.getX() + "," +this.getY() + ","
               + z + ")";
    }

    @Override
    public void movePlus10() {
        super.movePlus10();
        z += 10;
    }

    @Override
    protected void movePlusOne() {
        super.movePlusOne();
        z += 1;
    }
    @Override
    public double getDistanceFromOrigin() {
        return Math.sqrt(getX() * getX() + getY() * getY() + z * z);
    }
}
