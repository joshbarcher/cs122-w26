package interfaces;

public class Dog implements Moveable {
    private String name;
    private String location;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    public void moveTo(String location) {
        this.location = location;
    }

    public String getLocation() {
        return "Location: " + location.toUpperCase();
    }
}
