package program;

import points.Point;

public class UsePointsProgram {
    private Point origin = new Point(0, 0);

    public static void main() {
        UsePointsProgram program = new UsePointsProgram();

        program.testPoints();
        System.out.println(program.origin);
    }

    public void testPoints() {
        Point p1 = new Point(0, 1);
        Point p2 = new Point(3, 7);
        Point p3 = new Point(17, 4);

        Point[] points = {
                new Point(0, 1),
                new Point(0, 1),
                new Point(0, 1),
                new Point(0, 1),
                new Point(0, 1),
                new Point(0, 1),
                new Point(0, 1)
        };


        p1.change(3, 2);

        System.out.println(p1);
        System.out.println(p2);

        System.out.println("The number of points created is " +
                Point.getObjsCount());

        p3.printPoint();
        Point.printPoint();
    }
}
