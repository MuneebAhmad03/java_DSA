import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {


        Stack<String> stack = new Stack<String>();

        stack.push("A");   //ADD IN STACK
        stack.push("B");

        stack.pop();   // REMOVE FROM STACK


        System.out.println(stack);
        System.out.println(stack.peek());   //CHECK THE TOP OF THE STACK


    }
}