package hw3_21000705_nguyenbathang.ex2.simplearraylist;

public class TestSimpleArrayList {
    public static void main(String[] args) {
        SimpleArrayList<Integer> list = new SimpleArrayList<>();
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
    }
    public static void print(SimpleArrayList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
