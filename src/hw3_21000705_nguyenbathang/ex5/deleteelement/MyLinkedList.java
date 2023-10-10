package hw3_21000705_nguyenbathang.ex5.deleteelement;

public class MyLinkedList {
    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    public MyLinkedList() {
        this.head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public void deleteElementGreater(int index) {
        if (head == null || index < 0) {
            return;
        }

        Node current = head;
        int count = 0;
        while (current != null) {
            if (count == index) {
                break;
            }
            current = current.next;
            count++;
        }

        if (current == null) {
            return;
        }

        int value = current.data;

        current = head;
        Node prev = null;
        while (current != null) {
            if (current.data > value) {
                if (prev == null) {
                    head = current.next;
                } else {
                    prev.next = current.next;
                }
            } else {
                prev = current;
            }
            current = current.next;
        }
    }

    public void print() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }
}
