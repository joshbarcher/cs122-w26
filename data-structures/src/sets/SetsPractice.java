package sets;

import java.util.HashSet;
import java.util.TreeSet;

public class SetsPractice {
    public static void main() {
        TreeSet<BeachBall> ballSet = new TreeSet<BeachBall>();

        ballSet.add(new BeachBall(10, "plastic"));
        ballSet.add(new BeachBall(5, "nylon"));
        ballSet.add(new BeachBall(15, "plastic"));

        System.out.println(ballSet);
    }

    public static void practiceWithSets() {
        int[] numsArray = { 45, 12, 10, 9, 14, 12, 12, 10, 3 };
        HashSet<Integer> set = new HashSet<Integer>();

        int arrayLen = numsArray.length;
        for (int i = 0; i < numsArray.length; i++) {
            set.add(numsArray[i]);
        }
        int setSize = set.size();

        //how do I know whether duplicates were added or not?
        System.out.println(set.size() + " elements in the set!");
        System.out.println("Were elements rejected? " + (arrayLen != setSize));

        //checking for set ownership
        System.out.println(set.contains(10));

        int target = 10;
        for (int num : set) {
            System.out.println("Number: " + num);

            if (target == num) {
                System.out.println("Found the target: " + target);
            }
        }
    }
}
