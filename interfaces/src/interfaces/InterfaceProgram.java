import interfaces.*;

void main() {
    Dog dog = new Dog("Chance");
    Car car = new Car("Nissan", "Rogue");
    Canvas canvas = new Canvas("Water Color Ready", 12, 18);

    //using inheritance to upcast
    //Object[] objects = { dog, car };

    //using interfaces for upcast
    Moveable[] objects = { dog, car };
    Paintable[] paintables = { canvas, car };

    dog.moveTo("park");
    System.out.println(dog.getLocation());

    //interact with all moveables
    for (int i = 0; i < objects.length; i++) {
        visitParis(objects[i]);
    }

    //interact with all paintables
    for (int i = 0; i < paintables.length; i++) {
        paintables[i].paint("blue");
        System.out.println(paintables[i]);
    }
}

static void visitParis(Moveable object) {
    object.moveTo("Paris");
}