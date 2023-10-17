package hw4_21000705_nguyenbathang.pratice7.queueusing2stack;

public class TestQueue {
    public static void main(String[] args) {
        QueueUsingTwoStack<String> queue = new QueueUsingTwoStack<>();
        queue.enqueue("thang");
        queue.enqueue("tuan");
        queue.enqueue("lam");

        System.out.println(queue.dequeue() + queue.dequeue() + queue.dequeue());
        queue.enqueue("hoang");
        System.out.println(queue.dequeue());
    }
}
