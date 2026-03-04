package lists.runtime_analysis;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PracticeWithLists {
    public static void main() {
        //program against the interface!
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i <= 1000000; i++) {
            list.add(0, i);
        }
        System.out.println(list.size());

        //64 bit integer
        long count = 0;
        for (int i = 0; i < list.size(); i++) {
            count += list.get(i);
        }
        System.out.println("Total is " + count);
    }

    public static void badForLinkedLists() {
        //program against the interface!
        List<Integer> list = new LinkedList<Integer>();

        for (int i = 1; i <= 1000000; i++) {
            list.add(i);
        }
        System.out.println(list.size());

        //64 bit integer
        long count = 0;
        for (int i = 0; i < list.size(); i++) {
            count += list.get(i);
        }
        System.out.println("Total is " + count);
    }
}
