package hw3_21000705_nguyenbathang.ex7.countelement;


public class TestCountElement {
    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add(1);
        myList.add(2);
        myList.add(3);

        int count = myList.countElement(myList.getHead());
        System.out.println(count);
    }
}
