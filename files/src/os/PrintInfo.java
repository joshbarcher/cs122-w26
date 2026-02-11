package os;

import helpers.Console;

import java.io.File;
import java.io.IOException;

public class PrintInfo {
    public static void main() {
        boolean folder = Console.getBoolean("Create folder (true) or file (false)");

        String type = folder ? "folder" : "file";
        String path = Console.getString("Enter a " + type + " name");
        File file = new File(path);

        if (file.exists()) {
            String r = file.canRead() ? "r" : "-";
            String w = file.canWrite() ? "w" : "-";
            String x = file.canExecute() ? "x" : "-";
            String rwx = r + w + x;

            System.out.println("Permissions: " + rwx);

        } else {
            System.out.println("Cannot find the file: " + file.getAbsolutePath());
        }
    }
}
