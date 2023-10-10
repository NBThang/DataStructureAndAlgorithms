package hw3_21000705_nguyenbathang.ex5.indertelement;

public class MyDoubleLinkedList {
    private class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    public MyDoubleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void insertElement(int index, int element) {
        Node newNode = new Node(element);
        if (index < 0) {
            System.out.println("Index Invalid!");
            return;
        }
        if (index == 0) {
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            head = newNode;
            if (tail == null) {
                tail = newNode;
            }
        } else {
            Node current = head;
            int count = 0;
            while (count < index - 1 && current != null) {
                current = current.next;
                count++;
            }
            if (current == null) {
                System.out.println("Index Invalid!");
                return;
            }

            newNode.next = current.next;
            newNode.prev = current;
            if (current.next != null) {
                current.next.prev = newNode;
            } else {
                tail = newNode;
            }
            current.next = newNode;
        }
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
