package maps;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class BookWordCounter {
    public static void main() {
        try (Scanner reader = new Scanner(new FileInputStream("files/count.txt"))) {
            char[] badChars = { '!', ',', ';', ':', '"', '\'', '$', '%', '“', '”', '‘',
                                '-', '_', '?', '’', '.', '(', ')' };
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

                System.out.println(cleanLine);
            }

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
