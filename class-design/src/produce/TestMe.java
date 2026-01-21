package produce;

import objects.Alcohol;

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

        Alcohol drink1 =  new Alcohol();
        Alcohol drink2 =  new Alcohol();
        Alcohol drink3 = drink1;

        System.out.println(drink1.toString());
        System.out.println(drink2);
        System.out.println(drink3);

        System.out.println(drink1.equals(drink2));
        System.out.println(drink1.equals(drink3));

        drink1.printMe();

        int randNumber = 7;
        int otherNumber = randNumber; //randNumber = 7, otherNumber = 7
        randNumber++; //randNumber = 8, otherNumber = 7

        System.out.println(otherNumber);

        //foo(randNumber); //randNumber = 7
        //System.out.println(randNumber);

        Apple grannySmith = new Apple(200, "Green", "Granny Smith");
        foo2(grannySmith);
        System.out.println(grannySmith);
    }

    public static void foo2(Apple apple) {
        apple.setColor("Red");
        System.out.println(apple);
    }

    public static void foo(int number) { //number = 7
        number++; //number = 8
        System.out.println(number);
    }
}
