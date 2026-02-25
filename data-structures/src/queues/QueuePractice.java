package queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePractice {
    public static void main() {
        //program against the interface (this is a best practice)
        Queue<String> movieQueue = new LinkedList<String>();

        try {
            movieQueue.add("Raul");
            movieQueue.add("Grant");
            movieQueue.add("Onyx");
            movieQueue.add("Josh");
            movieQueue.add(null);

            System.out.println("Added " + movieQueue.size() + " elements!");

            //(back)Angela, Nick, null, Josh (front)

            System.out.println(movieQueue.remove());
            movieQueue.add("Nick");
            movieQueue.add("Angela");
            System.out.println(movieQueue.remove());
            System.out.println(movieQueue.peek());
            System.out.println(movieQueue.remove());

            //who is next in line? (front of the queue)
            //and...
            //what is the state of the queue

            //best to use while rather than for here...
//            while (!movieQueue.isEmpty()) {
//                String person = movieQueue.peek();
//                System.out.println(person + " buys a movie ticket!");
//            }

        } catch (RuntimeException ex) {
            System.out.println("Error adding element to the queue");
            System.out.println(ex.getMessage());
        }
    }
}
