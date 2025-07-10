import java.util.LinkedList;
import java.util.Queue;

public class Q_pratice {
    public static void main(String[] args) {


        Queue<String> queue = new LinkedList<String>();

        queue.offer("A");                                 //ADD IN QUEUE
        queue.offer("B");
        queue.offer("C");
        queue.offer("D");


        queue.poll();                                  // REMOVE FROM TOP OF QUEUE
        System.out.println(queue.peek());             // CHECK THE TOP ELEMENT
        System.out.println(queue);

        System.out.println(queue.isEmpty());        //CHECK IF ITS EMPTY OR NOT
        System.out.println(queue.size());          //CHECK THE SIZE
        System.out.println(queue.contains("B"));  //CHECK SPECIFIC ELEMENT THAT IT CONTAINS OR NOT
    }
}
