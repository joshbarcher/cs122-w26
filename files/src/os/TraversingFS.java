package os;

import helpers.Console;

import java.io.File;
import java.io.IOException;

public class TraversingFS {
    public static void main() {
        String path = Console.getString("Enter a folder name");
        File folder = new File(path);

        if (folder.isDirectory() && folder.exists()) {
            File[] contents = folder.listFiles();
            for (int i = 0; i < contents.length; i++) {
                File thing = contents[i];

                if (thing.isDirectory()) System.out.println("Found dir: " + thing.getAbsolutePath());
                else if (thing.isFile()) System.out.println("Found file: " + thing.getAbsolutePath());
            }

        } else {
            System.out.println("Please enter a valid folder name");
        }
    }
}
