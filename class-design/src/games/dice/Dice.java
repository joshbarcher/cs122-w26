package games.dice;

import java.awt.Color;
import java.util.Random;

public class Dice {
    private int sides;
    private int currentSide;
    private Color color;

    public Dice() {
        sides = 6;
        currentSide = 1;
        color = Color.WHITE;
    }

    public Dice(int sides, int currentSide, Color color) {
        this.sides = sides;
        this.currentSide = currentSide;
        this.color = color;
    }

    public void roll() {
        Random random = new Random();
        currentSide = random.nextInt(sides) + 1;
    }

    public int getCurrentSide() {
        return currentSide;
    }

    public String toString() {
        return "A " + color + " " + sides + " sided die!";
    }
}
