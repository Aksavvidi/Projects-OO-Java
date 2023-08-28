package gr.aueb.cf.ch11_12.immutableProject;

/**
 * Immutable Point3D
*/
 public class Point3D {
 private final Point point;
 private final int z;


 public Point3D() {
     point = new Point();
     z = 0;
 }
 public Point3D(Point point, int z){
     this.point = point;
     this.z = z;
 }

 public Point getPoint(){
     return point;
 }
 public int getZ() {
     return z;
 }
}