package hw3_21000705_nguyenbathang.ex5.queryelement;

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

    public int getByIndex(int index) {
        Node current = head;
        int count = 0;

        while (current != null) {
            if (count == index) {
                return current.data;
            }
            current = current.next;
            count++;
        }

        System.out.print("don't find element");
        return -1;
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
