package program;

import entities.Node;
import entities.Queue;

public class Main {
    public static void main(String[] args) {

        Queue myQueue = new Queue();

        myQueue.enqueue("fisrt");
        myQueue.enqueue("second");
        myQueue.enqueue("third");
        myQueue.enqueue("fourth");

        System.out.println(myQueue);

        System.out.println(myQueue.dequeue());

        System.out.println(myQueue);

        myQueue.enqueue("last");

        System.out.println(myQueue);
    }
}
