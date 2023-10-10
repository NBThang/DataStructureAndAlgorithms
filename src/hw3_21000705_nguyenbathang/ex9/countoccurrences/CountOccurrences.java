package hw3_21000705_nguyenbathang.ex9.countoccurrences;

public class CountOccurrences {
    public static class Node {
        int data;
        Node next;
        Node(int key) {
            data = key;
            next = null;
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
