package shapes;

public abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //this method is only here for child classes to override
    public abstract double area();
}
