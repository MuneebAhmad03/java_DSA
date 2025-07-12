import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_Queue {

    // Highest priority first
    // FIFO
    public static void main(String[] args) {

        Queue<Double> queue = new PriorityQueue<>();   // it shows the lowest first
        Queue<Double> queue1 = new PriorityQueue<>(Collections.reverseOrder());  // to reverse the order


        queue.offer(2.3);
        queue.offer(1.2);
        queue.offer(3.4);


        System.out.println(queue);
    }
}
