package shapes;

public class Square extends Rectangle {
    public Square(int size) {
        super(size, size);
    }

    public double area() {
        return getHeight() * getWidth();
    }
}
