package io.reading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromFiles {
    public static void main() {
        try (Scanner reader = new Scanner(new FileInputStream("data/files/ufos.txt"))) {
            //read the whole line
            String line = reader.nextLine();
            String[] parts = line.split(" ");

//            for (int i = 0; i < parts.length; i++) {
//                System.out.println(i + ": " + parts[i]);
//            }

            //read in the record token by token (brittle)
            String city = parts[0];
            String state = parts[1];
            int sightingCount = Integer.parseInt(parts[2]);
            double lat = Double.parseDouble(parts[3]);
            double lng = Double.parseDouble(parts[4]);
            boolean confirmed = Boolean.parseBoolean(parts[5]);

            System.out.println("There were " + sightingCount + " sitings in " + city + ", " + state);

        } catch (FileNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static void technique1() {
        try (Scanner reader = new Scanner(new FileInputStream("data/files/ufos.txt"))) {

            //read in the record token by token (brittle)
            String city = reader.next();
            String state = reader.next();
            int sightingCount = reader.nextInt();
            double lat = reader.nextDouble();
            double lng = reader.nextDouble();
            boolean confirmed = reader.nextBoolean();

            System.out.println("There were " + sightingCount + " sitings in " + city + ", " + state);

        } catch (FileNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
