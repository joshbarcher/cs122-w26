package points;

public class Point {
    //instance fields
    private int x, y;

    //static field
    private static int objsCount = 0;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;

        //RULE: Instance methods can access static fields
        objsCount++;
    }

    //RULE: instance methods must be called on an object
    //RULE: static methods can only interact with static members (field or method)
    public static void printPoint() {
        //System.out.println("(" + x + "," + y + ")");
        System.out.println("Static call from Point");
    }

    public void printPointValues() {
        System.out.println("(" + x + "," + y + ")");
    }

    //instance method
    public void change(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public int getX() { return x; }
    public int getY() { return y; }

    //static method
    //RULE: Static methods can access static fields
    public static int getObjsCount() { return objsCount; }
}
