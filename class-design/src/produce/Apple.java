package produce;

public class Apple extends Fruit {
    private String variety;

    public Apple(int calories, String color, String variety) {
        super(calories, color);
        this.variety = variety;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    //we inherited eat(), but are overriding the method here (replacing it)
    public void eat() {
        System.out.println("You ate a juicy apple!!!!");
    }

    public void smell() {
        System.out.println("The apply smells great!");
    }

    public void smell(String aroma) {
        System.out.println("You smell " + aroma);
    }

    public String toString() {
        return "A " + getColor() + " " + variety + " apple!";
    }
}
