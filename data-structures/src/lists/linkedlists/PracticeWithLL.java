package lists.linkedlists;

import java.util.LinkedList;
import java.util.List;

public class PracticeWithLL {
    public static void main() {
        //program against the interface
        List<Integer> listOfNums = new LinkedList<Integer>();

        listOfNums.add(22);
        listOfNums.add(33);
        listOfNums.add(44);

        System.out.println(listOfNums);

        System.out.println(listOfNums.get(0));
        System.out.println(listOfNums.get(1));
        System.out.println(listOfNums.get(2));

        System.out.println(listOfNums.contains(55));
    }
}
