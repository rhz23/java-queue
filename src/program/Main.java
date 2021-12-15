package program;

import entities.Node;
import entities.Queue;

public class Main {
    public static void main(String[] args) {

        Queue myQueue = new Queue();

        myQueue.enqueue(new Node("fisrt"));
        myQueue.enqueue(new Node("second"));
        myQueue.enqueue(new Node("third"));
        myQueue.enqueue(new Node("fourth"));

        System.out.println(myQueue);

        System.out.println(myQueue.dequeue());

        System.out.println(myQueue);

        myQueue.enqueue(new Node("last"));

        System.out.println(myQueue);
    }
}
