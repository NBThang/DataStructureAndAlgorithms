package hw4_21000705_nguyenbathang.pratice7.queueusing2stack;

import java.util.Stack;

public class QueueUsingTwoStack<E> {
    private Stack<E> stack1 = new Stack<>();
    private Stack<E> stack2 = new Stack<>();

    public void enqueue(E element) {
        stack1.push(element);
    }

    public E dequeue() {
        if (stack1.isEmpty() & stack2.isEmpty()) {
            throw new IllegalStateException("queue null");
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }
}
