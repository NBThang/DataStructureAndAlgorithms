package hw3_21000705_nguyenbathang.ex7.countelement;


public class TestCountElement {
    public static void main(String[] args) {
        CountElements.Node head = new CountElements.Node(1);
        CountElements.Node node2 = new CountElements.Node(2);
        CountElements.Node node3 = new CountElements.Node(1);
        CountElements.Node node4 = new CountElements.Node(2);
        CountElements.Node node5 = new CountElements.Node(1);
        CountElements.Node node6 = new CountElements.Node(3);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        int count = CountElements.countElement(head);
        System.out.println(count);
    }
}
