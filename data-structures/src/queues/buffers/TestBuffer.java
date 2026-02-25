package queues.buffers;

public class TestBuffer {
    public static void main() {
        String[] lines = {
            "The forest is a calm spiritual place,",
            "a balsam scented and serene space.",
            "Rabbits hide in mossy dens,",
            "with fresh mushroom gems.",
            "Magical!",
            "Cleanse.'",
            "Fanciful,",
            "trees, flowers and stems.",
            "Where creatures sleep and some race.",
            "A place to treat with kindness and grace,",
            "the forest is a calm spiritual place."
        };

        PrintBuffer buffer = new PrintBuffer();
        for (int i = 0; i < lines.length; i++) {
            buffer.print(lines[i]);
        }
        buffer.flush();
    }
}
