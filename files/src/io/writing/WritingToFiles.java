package io.writing;

import java.io.*;

public class WritingToFiles {
    public static void main() {
        try (PrintWriter writer = new PrintWriter(new FileOutputStream("data/files/contact.txt", true))) {
            writer.println("Josh Archer");
            writer.println("Instructor");
            writer.println(48);
            writer.println("Green River College");

        } catch (FileNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static void theOldWay() {
        PrintWriter writer = null;
        try {
            //writer = new PrintWriter("data/files/contact.txt", "UTF-8");
            writer = new PrintWriter(new FileOutputStream("data/files/contact.txt", true));
            //write name, position, age
            writer.println("Josh Archer");
            writer.println("Instructor");
            writer.println(48);
            writer.println("Green River College");

            //writer.flush(); //clear the internal buffer (which stores characters)
            System.out.println("File written to successfully!");

        } catch (FileNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            System.out.println("Finally block ran");
            //the finally block will ALWAYS run
            if (writer != null) {
                System.out.println("Writer closed");
                writer.close(); //calls flush(), returns the OS file handle
            }
        }
    }
}
