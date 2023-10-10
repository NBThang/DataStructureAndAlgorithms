package hw3_21000705_nguyenbathang.ex9.countoccurrences;

public class MyList {
    public static class Node {
        int data;
        Node next;
        Node(int key) {
            data = key;
            next = null;
        }
    }
    private Node head;
    public Node getHead() {
        return head;
    }

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public static int count(Node head, int element) {
        int count = 0;
        while(head != null) {
            if (head.data == element) {
                count++;
            }
            head = head.next;
        }
        return count;
    }
}
