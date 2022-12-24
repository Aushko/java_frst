public class MyFirstProgram {
    public static void main(String[] args) {
        System.out.println("My first program!");
        System.out.println(distance(new Point(1.0,2.0), new Point(3.0,4.0)));
    }
    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.x- p1.x, 2)+Math.pow(p2.y - p1.y, 2));
    }
}