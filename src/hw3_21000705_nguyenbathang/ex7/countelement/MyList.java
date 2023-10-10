package hw3_21000705_nguyenbathang.ex7.countelement;

public class MyList {
    private class Node{
        int data;
        Node next;
        Node(int a) {
            data = a;
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
    public static int countElement(Node head) {
        int count = 0;
        while(head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
}
