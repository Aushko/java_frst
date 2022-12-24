import java.util.Objects;

public class Point {
    public double x;
    public double y;

     public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public static double distance(Point p1, Point p2){
        double x21 = p2.x - p1.x;
        System.out.println("x2 - x1 = " + x21);

        double y21 = p2.y - p1.y;
        System.out.println("y2 - y1 = " + y21);

        double x21pow = Math.pow(x21, 2);
        System.out.println("(x2 - x1)^2 = " + x21pow);

        double y21pow = Math.pow(y21, 2);
        System.out.println("(y2 - y1)^2 = " + y21pow);

        double sPow = x21pow+y21pow;
        System.out.println("(x2 - x1)^2 + (y2 - y1)^2 = " + sPow);

        return Math.sqrt(Math.pow(p2.x - p1.x, 2)+Math.pow(p2.y - p1.y, 2));
    }
}
