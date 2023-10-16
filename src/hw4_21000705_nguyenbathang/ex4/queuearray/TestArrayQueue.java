package hw4_21000705_nguyenbathang.ex4.queuearray;

public class TestArrayQueue {
    public static void main(String[] args) throws IllegalAccessException {
        ArrayQueue<Integer> myQueue = new ArrayQueue<>();

        System.out.println("Is Queue empty?: " + myQueue.isEmpty()); // true

        // add element in queue
        myQueue.enqueue(1);
        myQueue.enqueue(3);
        myQueue.enqueue(5);
        myQueue.enqueue(7);
        myQueue.enqueue(9);

        System.out.println("Is Queue empty?: " + myQueue.isEmpty()); // false

        printQueue(myQueue);

        // print and delete element
        System.out.println("delete: " + myQueue.dequeue());
        System.out.println("delete: " + myQueue.dequeue());

        printQueue(myQueue);
    }
    public static void printQueue(ArrayQueue<Integer> arrayQueue) {
        System.out.println("element in the queue");
        for (Integer element : arrayQueue) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
