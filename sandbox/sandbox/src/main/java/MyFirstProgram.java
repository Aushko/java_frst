public class MyFirstProgram {
    public static void main(String[] args) {
        System.out.println("Координаты точек х1у1(1, 2) и х2у2(3, 4)");
        System.out.println("Расстояние = " + Point.distance(new Point(1.0,2.0), new Point(3.0,4.0)));

    }
   /* public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }

   private static double distance2(Point p1, Point p2) {
        double x21 = p2.x - p1.x;
        System.out.println("x2 - x1 = " + x21);

        double y21 = p2.y - p1.y;
        System.out.println("y2 - y1 = " + y21);

        double x21pow = Math.pow(x21, 2);
        System.out.println("pow2 x21 = " + x21pow);

        double y21pow = Math.pow(y21, 2);
        System.out.println("pow y21 = " + y21pow);

        return Math.sqrt(x21pow + y21pow);
    }*/
}