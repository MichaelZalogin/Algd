package javaCourseBlackBelt.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Some name3");
        queue.add("Some name4");
        queue.add("Some name5");
        queue.add("Some name1");
        queue.add("Some name2");
        queue.offer("Some name6");
        queue.offer("Some name7");
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.peek());
    }
}