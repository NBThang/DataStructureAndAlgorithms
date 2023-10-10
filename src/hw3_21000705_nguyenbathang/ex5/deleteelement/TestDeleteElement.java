package hw3_21000705_nguyenbathang.ex5.deleteelement;

import java.util.Scanner;

public class TestDeleteElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the size: ");
        int size = scanner.nextInt();

        MyLinkedList myLinkedList = new MyLinkedList();

        System.out.print("enter the number series: ");
        for (int i = 0; i < size ; i++) {
            int value = scanner.nextInt();
            myLinkedList.insert(value);
        }

        System.out.println("List:");
        myLinkedList.print();


        System.out.print("enter the index you want to compare: ");
        int index = scanner.nextInt();
        while (index < 0 || index > size) {
            System.out.println("invalid value, try again!");
            index = scanner.nextInt();
        }

        myLinkedList.deleteElementGreater(index);

        System.out.println("after delete elements greater than the index = " + index);
        myLinkedList.print();
    }
}
