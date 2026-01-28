package random;

import java.util.Random;

public class Randomizer {
    private Random random;

    //TODO: write getters/setters later...
    public static int evens;
    public static int odds;
    public static int zeroes;

    public Randomizer() {
        random = new Random();
    }

    public int generate() {
        return generate(1, 100);
    }

    public int generate(int low, int high) {
        int result = (int)Math.floor(random.nextInt(high - low + 1));

        if (result % 2 == 0) evens++;
        else odds++;

        if (result == 0) zeroes++;

        return result;
    }
}
