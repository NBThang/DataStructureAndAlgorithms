package hw4_21000705_nguyenbathang.ex2.buildstackusinglinkedlist;

import java.util.Iterator;

public class LinkedListStack<E> implements StackInterface<E> {
    class Node {
        E element;
        Node next;
    }
    private Node stack = null;
    @Override
    public void push(E element) {
        Node newNode = new Node();
        newNode.element = element;
        newNode.next = stack;
        stack = newNode;
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is null");
        }
        E element = stack.element;
        stack = stack.next;
        return element;
    }

    @Override
    public boolean isEmpty() {
        return stack == null;
    }

    @Override
    public E top() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is null");
        }
        return stack.element;
    }

    @Override
    public Iterator<E> iterator() {
        return new StackIterator();
    }

    class StackIterator<E> implements Iterator<E> {
        private Node currentNode = stack;

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public E next() {
            E data = (E) currentNode.element;
            currentNode = currentNode.next;
            return data;
        }
    }

}
