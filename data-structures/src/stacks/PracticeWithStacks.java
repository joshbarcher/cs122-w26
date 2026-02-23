package stacks;

import java.util.Arrays;
import java.util.Stack;

public class PracticeWithStacks {
    public static void main() {
        String[] peopleArray = { "Josh", "Yonghan", "Grant", "Russell", "Angela", "Nick", "Onyx", "Raul", "Alex" };
        System.out.println(Arrays.toString(peopleArray));

        String[] reversedArray = reverse(peopleArray);
        System.out.println(Arrays.toString(reversedArray));
    }

    public static void introToStacks(String[] peopleArray) {
        Stack<String> stack = new Stack<String>();

        for (int i = 0; i < peopleArray.length; i++) {
            String person = peopleArray[i];
            stack.push(person);
        }

        //pick presenters
        String next = stack.pop();
        System.out.println("Up next: " + next.toUpperCase());
        next = stack.peek(); //observe, not remove
        System.out.println("Anticipating up next: " + next.toUpperCase());
        next = stack.pop();
        System.out.println("Up next: " + next.toUpperCase());

        //random updates on the stack
        stack.push("Viktor");
        System.out.println(stack.peek());
        stack.push("Colin");
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());

        //after these updates... who was the last person selected/returned
        //and what is the state of the stack?

        System.out.println("Number of presenters left: " + stack.size());

        //indefinite loop (no idea how long it runs)
        while (!stack.isEmpty()) {
            System.out.println("Presenting next: " + stack.pop());
        }

        //definite loop (usually we know the number of iterations)
//        int numberLeft = stack.size();
//        for (int i = 1; i <= numberLeft; i++) {
//            System.out.println("Presenting next: " + stack.pop());
//        }
        System.out.println("Number of presenters left: " + stack.size());
    }

    public static String[] reverse(String[] people) {
        Stack<String> reverseStack = new Stack<String>();
        String[] results = new String[people.length];

        for (int i = 0; i < people.length; i++) {
            reverseStack.push(people[i]);
        }

        int nextIndex = 0;
        while (!reverseStack.isEmpty()) {
            String person = reverseStack.pop();
            results[nextIndex] = person;
            nextIndex++;
        }

        return results;
    }
}
