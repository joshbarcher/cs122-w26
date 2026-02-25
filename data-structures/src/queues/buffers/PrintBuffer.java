package queues.buffers;

import java.util.LinkedList;
import java.util.Queue;

public class PrintBuffer {
    private static final int BUFFER_MAX = 4;

    private Queue<String> msgQueue = new LinkedList<String>();

    public PrintBuffer() {
        //...
    }

    public void print(String msg) {
        msgQueue.add(msg);

        //have we reached the max threshold
        if (msgQueue.size() == BUFFER_MAX) {
            flush();
        }
    }

    public void flush() {
        //System.out.println("Emptying buffer");

        while (!msgQueue.isEmpty()) {
            System.out.println(msgQueue.remove());
        }
    }
}
