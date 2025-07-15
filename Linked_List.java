import java.util.LinkedList;

public class Linked_List {
    public static void main(String[] args) {



        LinkedList<String> linkedList = new LinkedList<String>();

        // USE AS STACK

//        linkedList.push("A");
//        linkedList.push("B");
//        linkedList.push("C");
//
//        linkedList.pop();



        //USE AS QUEUE

        linkedList.offer("1");
        linkedList.offer("2");
        linkedList.offer("3");
        linkedList.offer("4");
        linkedList.offer("5");
        linkedList.offer("6");
        linkedList.offer("7");

        linkedList.poll();

        linkedList.add(4,"4");    // ADD IN
        linkedList.remove("5");              // REMOVE

        // ADD FIRST N LAST

        linkedList.addFirst("0");
        linkedList.addLast("8");

        // REMOVE FIRST N LAST

        String first = linkedList.removeFirst();
        String last = linkedList.removeLast();


        System.out.println(linkedList.indexOf("8"));   //SHOW THE INDEX

        System.out.println(linkedList.peekFirst());   //CHECK FIRST ELEMENT
        System.out.println(linkedList.peekLast());     // CHECK LAST ELEMENT


        System.out.println(linkedList);











    }

}
