package produce;

public class TestMe {
    public static void main(String[] args) {
        Apple apple = new Apple(200, "Green", "Granny Smith");
        System.out.println(apple);

        apple.eat();
        apple.eat(true);
        apple.eat(5);
        apple.eat(false, 3);
        apple.eat(2, true);
        apple.smell();
    }
}
