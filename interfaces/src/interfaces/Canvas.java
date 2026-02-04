package interfaces;

public class Canvas implements Paintable {
    private String material;
    private double width;
    private double height;

    public Canvas(String material, double width, double height) {
        this.material = material;
        this.width = width;
        this.height = height;
    }

    public void paint(String color) {
        System.out.println("You paint the canvas " + color);
    }

    public void paintGray() {
        System.out.println("You paint gray");
    }

    public String getColor() {
        return "white";
    }
}
