package program;

import random.Randomizer;

import java.util.Random;

public class RandomizerTest {
    private static final int TEST_RUNS = 100;

    private Randomizer rand1 = new Randomizer();
    private Randomizer rand2 = new Randomizer();
    private Randomizer rand3 = new Randomizer();

    //RULE: static methods are called on a class
    public static void main() {
        RandomizerTest rt = new RandomizerTest();

        //RULE: instance fields are accessed through an object
        rt.test(rt.rand1, TEST_RUNS);
        rt.test(rt.rand2, TEST_RUNS);
        rt.test(rt.rand3, TEST_RUNS);

        rt.analytics();
    }

    //RULE: instance methods are called on objects
    public void test(Randomizer randomizer, int passes) {
        for (int i = 1; i <= passes; i++) {
            System.out.println(randomizer.generate(0, 20));
        }
    }

    public void analytics() {
        System.out.println("Evens: " + Randomizer.evens);
        System.out.println("Odds: " + Randomizer.odds);
        System.out.println("Zeroes: " + Randomizer.zeroes);
    }
}
