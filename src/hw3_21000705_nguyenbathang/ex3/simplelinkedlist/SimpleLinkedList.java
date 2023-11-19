package hw3_21000705_nguyenbathang.ex3.simplelinkedlist;

public class SimpleLinkedList<T>{
    class Node {
        T data;
        Node next;
    }

    private Node top = null;
    private Node bot = null;
    private int n = 0;

    public void add(T data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        if (top == null) {
            top = newNode;
            bot = newNode;
        } else {
            bot.next = newNode;
            bot = newNode;
        }
        n++;
    }

    public void addBot(T data) {
        add(data);
    }

    public T get(int i) {
        if (i < 0 || i >= n) {
            throw new IndexOutOfBoundsException();
        }

        Node nodeCurrent = top;
        for (int j = 0; j < i; j++) {
            nodeCurrent = nodeCurrent.next;
        }
        return nodeCurrent.data;
    }

    public void set(int i, T data) {
//        if (i < 0 || i >= n) {
//            throw new IndexOutOfBoundsException();
//        }

        Node nodeCurrent = top;
        for (int j = 0; j < i; j++) {
            nodeCurrent = nodeCurrent.next;
        }

        nodeCurrent.data = data;
    }

    public boolean isContain(T data) {
        Node nodeCurrent = top;
        while (nodeCurrent != null) {
            if (nodeCurrent.data.equals(data)) {
                return true;
            }
            nodeCurrent = nodeCurrent.next;
        }
        return false;
    }

    public int size() {
        return n;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public T removeTop() {
        if (top == null) {
            throw new IndexOutOfBoundsException("List empty!");
        }

        T newData = top.data;
        top = top.next;
        if (top == null) {
            bot = null;
        }
        n--;

        return newData;
    }

    public T removeBot() {
        if (bot == null) {
            throw new IndexOutOfBoundsException("List empty");
        }

        if (top == bot) {
            T newData = top.data;
            top = null;
            bot = null;
            n--;
            return newData;
        }

        Node nodeCurrent = top;
        while (nodeCurrent.next != bot) {
            nodeCurrent = nodeCurrent.next;
        }

        T removedData = bot.data;
        nodeCurrent.next = null;
        bot = nodeCurrent;
        n--;

        return removedData;
    }

    public void remove(T data) {
        Node nodeCurrent = top;
        Node prev = null;
        while (nodeCurrent != null) {
            if (nodeCurrent.data.equals(data)) {
                if (prev != null) {
                    prev.next = nodeCurrent.next;
                    if (nodeCurrent == bot) {
                        bot = prev;
                    }
                } else {
                    top = nodeCurrent.next;
                    if (nodeCurrent == bot) {
                        bot = null;
                    }
                }
                n--;
            }
            prev = nodeCurrent;
            nodeCurrent = nodeCurrent.next;
        }
    }
}
