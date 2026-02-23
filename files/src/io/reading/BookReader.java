package io.reading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BookReader {
    public static void main() {
        try (Scanner bookReader = new Scanner(new FileInputStream("data/files/monte-cristo.txt"))) {

            int linesCount = 0;
            int wordCount = 0;
            int totalWords = 0;

            //hasNextLine() returns true if there are more lines to read in the file
            while (bookReader.hasNextLine()) {
                //read the next line and return it
                String line = bookReader.nextLine();
                linesCount++;

                System.out.println(linesCount + ": " + line);

                String[] words = line.split(" ");
                totalWords += words.length;

                for (int i = 0; i < words.length; i++) {
                    String word = words[i];
                    if (word.equals("as")) {
                        wordCount++;
                    }
                }
            }

            System.out.println("Total words: " + totalWords);
            System.out.println("The number of times 'and' appears is: " + wordCount);
        } catch (FileNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
