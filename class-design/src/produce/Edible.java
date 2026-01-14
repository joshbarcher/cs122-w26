package produce;

public class Edible {
    private int calories;

    public Edible(int calories) {
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void smell() {
        System.out.println("The aroma is all right");
    }

    public String toString() {
        return "Edible with " + calories + " calories!";
    }
}
