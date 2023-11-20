package hw7_21000705_nguyenbathang.ex2.binarysearchtree;

import hw5_21000705_nguyenbathang.ex1.binarytreelinked.LinkedBinaryTree;
import hw7_21000705_nguyenbathang.ex1.searcharray.SearchElementInArray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class compareSearchTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the size: ");
        int size = scanner.nextInt();
        Integer[] array = creatArrayInteger(size);

        BinarySearchTree<Integer, LinkedBinaryTree.Node> myBST = new BinarySearchTree<>();
        LinkedBinaryTree.Node root =  myBST.addRoot(array[0]);
        for (int i = 1; i < size; i++) {
            myBST.insert(array[i], root);
        }

        timeLinearSearch(array, 1999);
        Arrays.sort(array);
        timeBinarySearch(array, 1999);
        timeSearchInBST(myBST, 1999);
    }

    public static boolean searchInBinarySearchTree(BinarySearchTree<Integer, LinkedBinaryTree.Node> myBST, int element) {
        return myBST.search(element, myBST.root());
    }

    public static Integer[] creatArrayInteger(int size) {
        Integer[] arr = new Integer[size];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(size);
        }

        return arr;
    }

    public static void timeLinearSearch(Integer[] array, int element) {
        SearchElementInArray search = new SearchElementInArray();
        long excutionTime = 0;
        long startTime = System.nanoTime();
        search.linearSearch(array, element);
        long endTime = System.nanoTime();
        excutionTime = excutionTime + endTime - startTime;

        System.out.println("time linerSearch = " + excutionTime);
    }

    public static void timeBinarySearch(Integer[] array, int element) {
        SearchElementInArray search = new SearchElementInArray();
        long excutionTime = 0;
        long startTime = System.nanoTime();
        search.binarySearchSortedArray(array, element);
        long endTime = System.nanoTime();
        excutionTime = excutionTime + endTime - startTime;

        System.out.println("time binarySearch = " + excutionTime);
    }

    public static void timeSearchInBST(BinarySearchTree<Integer, LinkedBinaryTree.Node> myBST, int element) {
        long excutionTime = 0;
        long startTime = System.nanoTime();
        myBST.search(element, myBST.root());
        long endTime = System.nanoTime();
        excutionTime = excutionTime + endTime - startTime;

        System.out.println("time searchInBST = " + excutionTime);
    }
}
