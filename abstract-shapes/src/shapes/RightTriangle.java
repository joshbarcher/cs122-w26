package shapes;

public class RightTriangle extends Shape {
    private double base;
    private double height;

    public RightTriangle(double base, double height) {
        super("right triangle");

        this.base = base;
        this.height = height;
    }

    public double getBase() { return base; }
    public double getHeight() { return height; }

    public double area() {
        return 0.5 * base * height;
    }
}
