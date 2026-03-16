package maps;

import java.util.Random;
import java.util.TreeMap;

public class LawOfLargeNumbers {
    public static void main() {
        TreeMap<Integer, Integer> counts = new TreeMap<Integer, Integer>();
        int experiments = 1000000;
        Random rand = new Random();

        for (int i = 1; i <= experiments; i++) {
            int side = rand.nextInt(6) + 1;

            //update counts in the map
            if (!counts.containsKey(side)) counts.put(side, 0);
            counts.put(side, counts.get(side) + 1);
        }

        for (int side : counts.keySet()) {
            int count = counts.get(side);

            //convert count to percent
            double percent = (count * 1.0) / experiments;
            percent *= 100;

            System.out.println(side + ": " + percent + "%");
        }
    }
}
