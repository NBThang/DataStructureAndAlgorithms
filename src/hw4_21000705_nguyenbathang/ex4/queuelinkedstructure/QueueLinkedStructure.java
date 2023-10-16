package hw4_21000705_nguyenbathang.ex4.queuelinkedstructure;

import java.util.Iterator;

public class QueueLinkedStructure<E> implements QueueInterface<E> {
    class Node<E> {
        E data;
        Node<E> next;
    }

    private Node<E> front;
    private Node<E> rear;
    int size;
    public QueueLinkedStructure() {
        front = null;
        rear = null;
        size = 0;
    }
    public int getSize() {
        return this.size;
    }
    @Override
    public void enqueue(E element) {
        Node<E> newNode = new Node<>();
        newNode.data = element;
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    @Override
    public E dequeue()  {
        if (isEmpty()) {
            throw new IllegalStateException("Queue null!");
        }
        E element = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return element;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Iterator<E> iterator() {
        return new QueueIterator();
    }

    private class QueueIterator implements Iterator<E> {
        private Node<E> current;

        public QueueIterator() {
            current = front;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new IllegalStateException("No more elements in the queue");
            }
            E element = current.data;
            current = current.next;
            return element;
        }
    }
}
