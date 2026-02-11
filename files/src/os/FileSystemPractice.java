package os;

import helpers.Console;

import java.io.File;
import java.io.IOException;

public class FileSystemPractice {
    public static void main() {
        boolean folder = Console.getBoolean("Create folder (true) or file (false)");

        String type = folder ? "folder" : "file";
        String path = Console.getString("Enter a " + type + " name");
        File newFile = new File(path);

        if (newFile.exists()) {
            System.out.println(type + " already exists!");
        } else {
            try {
                if (folder) {
                    newFile.mkdir(); //mkdir in linux
                } else {
                    newFile.createNewFile(); //touch in linux
                }
                System.out.println("Created " + type + ": " + newFile.getAbsolutePath());
            } catch (IOException e) {
                System.out.println("Problem creating " + type + ": " + newFile.getAbsolutePath());
            }
        }
    }
}
