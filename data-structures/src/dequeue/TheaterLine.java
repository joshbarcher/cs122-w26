package dequeue;

import java.util.LinkedList;

/*
    This represents a double-ended queue
    for VIP access + theater lines.
 */
public class TheaterLine {
    private LinkedList<String> line;

    public TheaterLine() {
        line = new LinkedList<String>();
    }

    public void enterLine(String name, boolean isVip) {
        if (!isVip) {
            line.addLast(name);
        } else {
            line.addFirst(name);
        }
    }

    public String exitLine() {
        return line.removeFirst();
    }

    public boolean lineEmpty() {
        return line.isEmpty();
    }

    public String toString() {
        return line.toString();
    }
}
