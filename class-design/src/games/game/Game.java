package games.game;

import games.dice.Dice;

import java.awt.*;

public class Game {
    private static final int ROUNDS = 10;

    private Player player1;
    private Player player2;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startMatch() {
        for (int i = 1; i <= ROUNDS; i++) {
            System.out.println("Round #" + i);

            //get both dice
            Dice die1 = player1.getDie();
            Dice die2 = player2.getDie();

            //roll the dice
            die1.roll();
            die2.roll();
            int roll1 = die1.getCurrentSide();
            int roll2 = die2.getCurrentSide();

            System.out.println();
            System.out.println(player1.getName() + " rolls " + roll1);
            System.out.println(player2.getName() + " rolls " + roll2);

            //see who winner is (5 points for a win, 2 for a tie)
            if (roll1 > roll2) { //player 1 wins!
                System.out.println("Player 1 wins!");
                player1.playerScore(5);
            } else if (roll1 < roll2) { //player 2 wins!
                System.out.println("Player 2 wins!");
                player2.playerScore(5);
            } else { //tie!
                System.out.println("Both players tie!");
                player1.playerScore(2);
                player2.playerScore(2);
            }
            System.out.println();
        }
    }

    public void matchEnd() {
        int score1 = player1.getScore();
        int score2 = player2.getScore();
        System.out.println(player1.getName() + " scored " + score1 + " points");
        System.out.println(player2.getName() + " scored " + score2 + " points");

        if (score1 > score2) {
            System.out.println(player1.getName() + " wins!");
        } else if (score2 > score1) {
            System.out.println(player2.getName() + " wins!");
        } else {
            System.out.println("The game is a tie!");
        }
    }

    public static void main(String[] args) {
        Player p1 = new Player("Grant", new Dice(20, 1, Color.GRAY));
        Player p2 = new Player("Brian", new Dice(20, 1, Color.RED));

        Game game = new Game(p1, p2);
        game.startMatch();
        game.matchEnd();
    }
}
