package hw4_21000705_nguyenbathang.ex4.queuelinkedstructure;


public class TestQueueLinkedStructure {
    public static void main(String[] args) throws IllegalAccessException {
        QueueLinkedStructure myQueue = new QueueLinkedStructure<>();

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
    public static void printQueue(QueueLinkedStructure<Integer> arrayQueue) {
        System.out.println("element in the queue");
        for (Integer element : arrayQueue) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
