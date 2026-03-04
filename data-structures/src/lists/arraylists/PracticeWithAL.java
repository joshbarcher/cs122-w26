package lists.arraylists;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PracticeWithAL {
    public static void main() {
        //program against the interface
        List<Integer> list = new ArrayList<Integer>();

        list.add(42);
        list.add(6);
        list.add(44);
        list.add(3);
        list.add(7);
        list.add(2);

        System.out.println(list);

        //get() + set() for altering/reading positions
        System.out.println(list.get(0)); //not list[0]
        System.out.println(list.get(1));
        System.out.println(list.get(list.size() - 1));

        System.out.println("Before: " + list.get(3));
        list.set(3, 12);
        System.out.println("After: " + list.get(3));

        System.out.println(list.contains(7));
        System.out.println(list.contains(-7));

        System.out.println("Size before clear(): " + list.size());
        list.clear();
        System.out.println("Size after clear(): " + list.size());

        Random rand = new Random();
        System.out.println(LocalDateTime.now());
        for (int i = 1; i < 1000; i++) {
            int num = rand.nextInt();
            list.add(num);
        }

        LocalDateTime before = LocalDateTime.now();
        System.out.println(before);

        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            //System.out.println(num);
        }
        System.out.println(before);
        System.out.println(LocalDateTime.now());

        if (list.contains(42)) {
            System.out.println("I found 42!");
        } else {
            System.out.println("Couldn't find 42!");
        }

        //fancy for-each loop (syntactic sugar)
        for (int num : list) {
            System.out.println("Number read: " + num);
        }
    }
}
