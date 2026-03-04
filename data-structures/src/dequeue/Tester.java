package dequeue;

public class Tester {
    public static void main() {
        String[] names = { "Alice", "Brian", "Carla", "David",
                "Elena", "Frank", "Grace", "Hector"
        };

        String[] vips = { "Liam", "Olivia", "Noah" };

        TheaterLine line = new TheaterLine();

        for (String name : names) {
            line.enterLine(name, false);
        }

        line.enterLine(vips[0], true);

        //let folks into their movie
        while (!line.lineEmpty()) {
            System.out.println(line);
            System.out.println(line.exitLine());
        }
    }
}
