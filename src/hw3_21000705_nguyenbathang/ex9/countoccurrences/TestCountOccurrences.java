package hw3_21000705_nguyenbathang.ex9.countoccurrences;

public class TestCountOccurrences {
    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add(1);
        myList.add(2);
        myList.add(1);
        myList.add(3);
        myList.add(1);
        myList.add(1);

        int coutElement = 0;
        coutElement = MyList.count(myList.getHead(), 1);

        System.out.println(coutElement);

    }
}
