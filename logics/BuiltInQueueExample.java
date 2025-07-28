package logics;

import java.util.LinkedList;
import java.util.Queue;

public class BuiltInQueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Add elements
        queue.add(10);
        queue.add(20);
        queue.add(30);

        // Peek (view front element)
        System.out.println("Front element: " + queue.peek());

        // Remove elements
        System.out.println("Removed: " + queue.remove());

        // Iterate
        System.out.println("Remaining Queue:");
        for (int item : queue) {
            System.out.println(item);
        }
    }
}

