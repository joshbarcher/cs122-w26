package algorithms;

import java.util.Arrays;
import java.util.HashMap;

public class Stats {
    public static void main() {
        double[] temps = { 30.5, 42.5, 42.5, 42.5, 75, 75, 75, 75, 100 };
        double[] range = getRange(temps);

        double mean = getMean(temps);
        double sum = getSum(temps);
        double product = getProduct(temps);

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Mean: " + mean);
        System.out.println("Low: " + range[0]);
        System.out.println("High: " + range[1]);

        double median = getMedian(temps);
        System.out.println("The median element is: " + median);

        double mode = getMode(temps);
        System.out.println("The mode element is: " + mode);
    }

    //simplified mode calculation
    private static double getMode(double[] array) {
        HashMap<Double, Integer> tempCounts = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            double temp = array[i];

            if (!tempCounts.containsKey(temp)) tempCounts.put(temp, 0);
            tempCounts.put(temp, tempCounts.get(temp) + 1);
        }
        System.out.println(tempCounts);

        //find the biggest value
        int largeCount = 0;
        double largeTemp = 0.0;
        for (double temp : tempCounts.keySet()) {
            int count = tempCounts.get(temp);

            if (count > largeCount) {
                largeCount = count;
                largeTemp = temp;
            }
        }

        return largeTemp;
    }

    private static double getMedian(double[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int medianIndex = array.length / 2;
        return array[medianIndex];
    }

    private static double getProduct(double[] array) {
        double product = 1;
        for (int i = 0; i < array.length; i++) {
            product *= array[i];
        }
        return product;
    }

    private static double getMean(double[] array) {
        double sum = getSum(array);
        double avg = sum / array.length;
        return avg;
    }

    private static double getSum(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    private static double[] getRange(double[] array) {
        double min = array[0];
        double max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        return new double[] {min, max};
    }
}
