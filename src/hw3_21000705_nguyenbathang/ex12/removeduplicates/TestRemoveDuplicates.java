package hw3_21000705_nguyenbathang.ex12.removeduplicates;

public class TestRemoveDuplicates {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        System.out.println("befor delete duplicates");
        printList(node1);

        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        ListNode listAfterDeleteDuplicates = removeDuplicates.deleteDuplicates(node1);

        System.out.println("after delete duplicates");
        printList(listAfterDeleteDuplicates);
    }

    public static void printList(ListNode listNode) {
        while (listNode != null) {
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
        System.out.println();
    }
}