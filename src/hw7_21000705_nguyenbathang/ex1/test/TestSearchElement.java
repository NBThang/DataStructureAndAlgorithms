package hw7_21000705_nguyenbathang.ex1.test;

import hw3_21000705_nguyenbathang.ex3.simplelinkedlist.SimpleLinkedList;
import hw7_21000705_nguyenbathang.ex1.searcharray.SearchElementInArray;
import hw7_21000705_nguyenbathang.ex1.searchlinkedstructure.SearchElementInLinkedStructure;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TestSearchElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the size: " );
        int size = scanner.nextInt();

        Integer[] array = creatArrayInteger(size);
        printArray(array);

        Random random = new Random();

        SearchElementInArray searchArray = new SearchElementInArray();
        int element = random.nextInt(size);

        System.out.println("exist " + element + "?: " + searchArray.linearSearch(array, element));

        Integer[] cloneArray = array.clone();
        Arrays.sort(cloneArray);
        System.out.println("exist " + element + "?: " + searchArray.binarySearchSortedArray(cloneArray, element));

        System.out.println("exist " + element + "?: " + searchArray.binarySearchUnSortedArray(array, element));

        System.out.println("------------------------------------------------------");

        SimpleLinkedList<Integer> myList = creatLinkedList(size);
        printLinkedList(myList);

        SearchElementInLinkedStructure<Integer> searchList = new SearchElementInLinkedStructure<>();

        System.out.println("exist " + element + "?: " + searchList.linearSearch(myList, element));
        System.out.println("exist " + element + "?: " + searchList.binarySearchInSortLinkedList(myList, element));
    }

    public static Integer[] creatArrayInteger(int size) {
        Integer[] arr = new Integer[size];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(size);
        }

        return arr;
    }

    public static SimpleLinkedList creatLinkedList(int size) {
        SimpleLinkedList<Integer> simpleLinkedList = new SimpleLinkedList<>();
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            simpleLinkedList.set(i, random.nextInt(size));
        }

        return simpleLinkedList;
    }

    public static void printArray(Integer[] array) {
        for (int temp : array) {
            System.out.print(temp + " ");
        }
        System.out.println();
    }

    public static void printLinkedList(SimpleLinkedList<Integer> simpleLinkedList) {
        for (int i = 0; i < simpleLinkedList.size(); i++) {
            System.out.print(simpleLinkedList.get(i) + " ");
        }
        System.out.println();
    }
}
