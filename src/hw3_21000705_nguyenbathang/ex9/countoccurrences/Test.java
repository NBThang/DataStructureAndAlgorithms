package hw3_21000705_nguyenbathang.ex9.countoccurrences;

public class Test {
    public static void main(String[] args) {
        CountOccurrences.Node head = new CountOccurrences.Node(1);
        CountOccurrences.Node node2 = new CountOccurrences.Node(2);
        CountOccurrences.Node node3 = new CountOccurrences.Node(1);
        CountOccurrences.Node node4 = new CountOccurrences.Node(2);
        CountOccurrences.Node node5 = new CountOccurrences.Node(1);
        CountOccurrences.Node node6 = new CountOccurrences.Node(3);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        int coutElement = 0;
        coutElement = CountOccurrences.count(head, 1);

        System.out.println(coutElement);

    }
}
