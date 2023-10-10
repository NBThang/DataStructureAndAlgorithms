package hw2_21000705_nguyenbathang.evaluatesort;

import java.util.Random;
import java.util.Scanner;

public class UsingSortAlgorithms {
    public void usingSortAlgorithms() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the size: ");
        int size = scanner.nextInt();
        int[] array = creatArray(size);

        AlgorithmsSort algorithmsSort = new AlgorithmsSort();

        // buble sort
        usingBubleSort(array, algorithmsSort);

        // selection sort
        System.out.println();
        usingSelectionSort(array, algorithmsSort);

        // insertinon sort
        System.out.println();
        usingInsertionSort(array, algorithmsSort);

        // quick sort
        System.out.println();
        usingQuickSort(array, algorithmsSort);

        // merge sort
        System.out.println();
        usingMergeSort(array, algorithmsSort);
    }

    public static int[] creatArray(int size){
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            Random random = new Random();
            int randomNumber = random.nextInt(1000000) + 1;
            array[i] = randomNumber;
        }
        return array;
    }

    public static void usingBubleSort(int[] array, AlgorithmsSort algorithmsSort) {
        System.out.println("befor using buble sort");
        printArray(array);
        int[] arrayUsingBubleSort = algorithmsSort.bubleSort(array);
        System.out.println("\nafter using buble sort");
        printArray(arrayUsingBubleSort);
    }

    public static void usingSelectionSort(int[] array, AlgorithmsSort algorithmsSort) {
        System.out.println("\nbefor using selection sort");
        printArray(array);
        int[] arrayUsingSelectionSort = algorithmsSort.selectionSort(array);
        System.out.println("\nafter using selection sort");
        printArray(arrayUsingSelectionSort);
    }

    public static void usingInsertionSort(int[] array, AlgorithmsSort algorithmsSort) {
        System.out.println("\nbefor using insertion sort");
        printArray(array);
        int[] arrayInsertionSort = algorithmsSort.insertionSort(array);
        System.out.println("\nafter using insertion sort");
        printArray(arrayInsertionSort);
    }

    public static void usingQuickSort(int[] array, AlgorithmsSort algorithmsSort) {
        System.out.println("\nbefor using quick sort");
        printArray(array);
        int[] arrayQuickSort = algorithmsSort.quickSort(array, 0, array.length - 1);
        System.out.println("\nafter using quick sort");
        printArray(arrayQuickSort);
    }

    public static void usingMergeSort(int[] array, AlgorithmsSort algorithmsSort) {
        System.out.println("\nbefor using merge sort");
        printArray(array);
        int[] arrayMergeSort = algorithmsSort.mergeSort(array, 0, array.length - 1);
        System.out.println("\nafter using merge sort");
        printArray(arrayMergeSort);
    }

    public static void printArray(int[] array) {
        for (int temp : array) {
            System.out.print(temp + " ");
        }
    }
}
