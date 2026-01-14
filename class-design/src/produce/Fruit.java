package produce;

public class Fruit extends Edible {
    private String color;

    public Fruit(int calories, String color) {
        super(calories);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void eat() {
        System.out.println("You ate the fruit");
    }

    public void eat(boolean today) {
        if (today) System.out.println("You ate the fruit today");
        else System.out.println("You ate the fruit another day");
    }

    public void eat(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("You ate some of the fruit");
        }
    }

    public void eat(boolean today, int times) {
        for (int i = 0; i < times; i++) {
            //ternary statement
            String todayStr = today == true ? " today" : " another day";
            System.out.println("You ate some of the fruit" + todayStr);
        }
    }

    public void eat(int times, boolean rushed) {
        for (int i = 0; i < times; i++) {
            //ternary statement
            String todayStr = rushed == true ? " (I was rushed)" : "";
            System.out.println("You ate some of the fruit" + todayStr);
        }
    }

    public String toString() {
        return "A " + getColor() + " fruit!";
    }
}
