package program;

import io.Console;

public class Arithmetic {
    public static void main() {
        String name = Console.getString("Enter your name");
        int op1 = Console.getInt("Enter operand #1");
        int op2 = Console.getInt("Enter operand #2");
        int guess = Console.getInt("What is " + op1 + " + " + op2 + "?");

        if (guess == (op1 + op2)) {
            Console.println("You were right!");
        } else {
            Console.println("You were wrong!");
        }
        Console.println("Please play again " + name + "!");
    }
}
