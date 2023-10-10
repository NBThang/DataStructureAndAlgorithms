package hw3_21000705_nguyenbathang.ex5.queryelement;

import java.util.Scanner;

public class TestQueryElement {
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

        System.out.print("enter index find: ");
        int index = scanner.nextInt();

        if (index < 0 || index > size) {
            System.out.println("Index Invalid!");
        } else {
            int element = myLinkedList.getByIndex(index);
            System.out.println(element);
        }
    }
}
