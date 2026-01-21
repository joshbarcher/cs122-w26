package games.game;

import games.dice.Dice;

public class Player {
    private String name;
    private int score;
    private Dice die;

    public Player(String name, Dice die) {
        this.name = name;
        this.die = die;
    }

    public String getName() {
        return name;
    }

    public Dice getDie() {
        return die;
    }

    public int getScore() {
        return score;
    }

    public void playerScore(int amount) {
        score += amount;
    }

    public String toString() {
        return name + ": " + score;
    }
}
