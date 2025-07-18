import java.util.ArrayList;
import java.util.LinkedList;

public class link_vs_array {
    public static void main(String[] args) {

        LinkedList<Integer> linkList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();


        long startTime;
        long endTime;
        long elapsedTime;

        for (int i = 0;i < 1000000; i++){
            linkList.add(i);
            arrayList.add(i);
        }

//LINKEDLIST
        startTime = System.nanoTime();

       // linkList.get(0);
        //linkList.get(50000);
        //linkList.get(999999);
        linkList.remove(50000);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("LinkedList : \t" +elapsedTime +"ns");


//ARRAYLIST

        startTime = System.nanoTime();

        //arrayList.get(0);
        //arrayList.get(50000);
       // arrayList.get(999999);
        linkList.remove(50000);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("ArrayList : \t" +elapsedTime +"ns");

        /*
        ArrayList is faster than the linked list because in the linkedlist
        its a doubly linkedlist so it has 2 memory location and in arraylist its easy to find that
         */


    }
}
