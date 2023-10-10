package hw3_21000705_nguyenbathang.ex5.indertelement;

import java.util.Scanner;

public class TestInsertElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the size: ");
        int size = scanner.nextInt();

        MyDoubleLinkedList myDoubleLinkedList = new MyDoubleLinkedList();

        System.out.println("enter the number series: ");
        for (int i = 0; i < size; i++) {
            int value = scanner.nextInt();
            myDoubleLinkedList.add(value);
        }

        myDoubleLinkedList.print();

        System.out.print("enter the index: ");
        int index = scanner.nextInt();

        System.out.print("\nenter the element insert: ");
        int element = scanner.nextInt();

        myDoubleLinkedList.insertElement(index, element);

        myDoubleLinkedList.print();
    }
}
