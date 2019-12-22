import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static class MyQueue<T> {
        Stack<T> FIFO = new Stack<T>();
        Stack<T> LIFO = new Stack<T>();

        public void enqueue(T value) {
            FIFO.insertElementAt(value, LIFO.size());
            LIFO.insertElementAt(value, 0); 
        }

        public T peek() {
            return FIFO.firstElement();
        }

        public T dequeue() {
            FIFO.remove(0); 
            return LIFO.remove(LIFO.size()-1);
        }
        public void printState() {
            System.out.println("FIFO == " + FIFO);
            System.out.println("LIFO == " + LIFO);
        }
    }

    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        //queue.printState();
        scan.close();
    }
}
