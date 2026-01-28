package program;

import shapes.*;

public class Program {
    public static void main() {
        Rectangle rect = new Rectangle(10.1, 4.2);
        Circle circle = new Circle(3.5);
        //Shape shape = new Shape("Rhombus");

        //this technique is called up-casting
        Shape rectShape = new Rectangle(3, 4);
        Shape[] shapes = {
            rect,
            circle,
            new Rectangle(1, 3.6),
            new Circle(9.4),
            new RightTriangle(3.98, 4.1),
            new Square(20)
        };

        for (int i = 0; i < shapes.length; i++) {
            Shape shape = shapes[i];
            System.out.println(shape.area());
        }

//        System.out.println("Area of rect: " + rect.area());
//        System.out.println("Area of circle: " + circle.area());
    }
}
