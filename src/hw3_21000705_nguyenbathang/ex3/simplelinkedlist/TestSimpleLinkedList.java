package hw3_21000705_nguyenbathang.ex3.simplelinkedlist;

public class TestSimpleLinkedList {
    public static void main(String[] args) {
        SimpleLinkedList<Integer> list = new SimpleLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(5);

        print(list);

        list.set(3,100);

        System.out.println();
        print(list);

        System.out.println("\n" + list.isContain(1));

        System.out.println(list.get(3));

        list.remove(5);
        print(list);

        System.out.println();
        list.removeBot();
        print(list);

        System.out.println();
        list.removeTop();
        print(list);
    }

    public static void print(SimpleLinkedList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
