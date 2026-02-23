package stacks;

import java.util.Stack;

public class Brackets {
    public static void main() {
        String testMe = "(9 + {10 * 2} / 3)";

        //we need to use the wrapper class (Character) to store primitive chars
        Stack<Character> stack = new Stack<Character>();
        char[] characters = testMe.toCharArray();
        char[] goodChars = {'(', ')', '[', ']', '{', '}'};

        for (int i = 0; i < characters.length; i++) {
            char next = characters[i]; // [

            //ignore non-bracket chars
            boolean matched = false;
            for (int j = 0; j < goodChars.length; j++) {
                if (goodChars[i] == next) {
                    matched = true;
                    break;
                }
            }

            //proceed only if we have a good char
            if (!matched) continue;

            //add opening brackets to the stack
            if (next == '(' || next == '{' || next == '[') {
                stack.push(next);
            } else {
                //otherwise, we have a closing bracket
                char openBracket = stack.pop();

                //match brackets if we can
                if (openBracket == '(' && next == ')') continue;
                else if (openBracket == '[' && next == ']') continue;
                else if (openBracket == '{' && next == '}') continue;
                else {
                    System.out.println("Not balanced!");
                    return; //exit main() and stop the program
                }
            }
        }
        System.out.println("Balanced!");
    }
}
