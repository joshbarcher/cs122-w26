package maps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;

public class BookCharacterCounter {
    public static void main() {
        TreeMap<Character, Integer> characterMap = new TreeMap<Character, Integer>();

        try (Scanner reader = new Scanner(new FileInputStream("files/count.txt"))) {

            while (reader.hasNextLine()) {
                String line = reader.nextLine();

                char[] chars = line.toCharArray();
                for (char chr : chars) {
                    if (!characterMap.containsKey(chr)) characterMap.put(chr, 0);

                    //single line count update (make note of this...)
                    characterMap.put(chr, characterMap.get(chr) + 1);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error reading from file: " + ex.getMessage());
        }

        for (char chr : characterMap.keySet()) {
            int count = characterMap.get(chr);

            System.out.println(chr + ": " + count);
        }
    }
}
