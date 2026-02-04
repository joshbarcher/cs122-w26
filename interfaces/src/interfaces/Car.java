package interfaces;

public class Car implements Moveable, Paintable {
    private String make;
    private String model;
    private String location;
    private String color;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() { return make; }
    public String getModel() { return model; }

    public void moveTo(String location) {
        if (location.endsWith("Street")) {
            this.location = location;
        }
    }

    public String getLocation() {
        return "Location: " + location;
    }

    public void paint(String color) {
        if (color == null || color.isEmpty()) return;
        System.out.println("You change the car to " + color);
        this.color = color;
    }

    public void paintGray() {
        color = "gray";
    }

    public String getColor() {
        return color;
    }
}
