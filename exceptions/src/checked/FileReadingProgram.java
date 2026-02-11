package checked;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileReadingProgram {
    public static void main() {
        FileReadingProgram program = new FileReadingProgram();
        try {
            program.printClassDetails("class.txt");
        } catch (IOException ex) {
            System.out.println("An error occurred");
            System.out.println(ex.getMessage());
            //ex.printStackTrace();
            throw new ArithmeticException("Because reasons...");

        } finally {
            System.out.println("Cleaning up!");
        }
        System.out.println("Programming ended!");
    }

    public void printClassDetails(String fileName) throws FileNotFoundException {
        //use a design pattern called the "decorator pattern"
        Scanner reader = new Scanner(new FileInputStream(fileName));
        String line = reader.nextLine();
        System.out.println(line);
    }
}
