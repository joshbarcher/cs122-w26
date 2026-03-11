package maps;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;

public class BookWordCounter {
    public static void main() {
        TreeMap<String, Integer> wordMap = new TreeMap<String, Integer>();

        try (Scanner reader = new Scanner(new FileInputStream("files/count.txt"))) {
            char[] badChars = { '!', ',', ';', ':', '"', '\'', '$', '%', '“', '”', '‘',
                                '-', '—', '_', '?', '’', '.', '(', ')' };
            HashSet<Character> badCharSet = new HashSet<Character>();
            for (char chr : badChars) {
                badCharSet.add(chr);
            }

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String cleanLine = "";

                //remove any bad characters
                for (int i = 0; i < line.length(); i++) {
                    char chr = line.charAt(i);
                    if (!badCharSet.contains(chr))  {
                        cleanLine += chr;
                    }
                }

                //remove uppercase letters
                cleanLine = cleanLine.toLowerCase();

                //pull out words in the line
                String[] words = cleanLine.split(" ");
                for (String word : words) {
                    if (!wordMap.containsKey(word)) wordMap.put(word, 0);

                    //update our counts in the map
                    int currentCount = wordMap.get(word);
                    currentCount++;
                    wordMap.put(word, currentCount);
                }
            }

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
            return; //exit the program
        }

        //at this point, the file was read, and we have our counts
        for (String word : wordMap.keySet()) {
            int wordCount = wordMap.get(word);

            System.out.println(word + " -> " + wordCount);
        }
    }
}
