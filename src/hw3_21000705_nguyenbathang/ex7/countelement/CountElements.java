package hw3_21000705_nguyenbathang.ex7.countelement;

public class CountElements {
    public static class Node {
        int data;
        Node next;
        Node(int a) {
            data = a;
            next = null;
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
