package hw2_21000705_nguyenbathang.evaluatesort;

import java.util.Random;
import java.util.Scanner;

public class EvaluateSortAlgorithms {
    public void evaluateSortAlgorithms() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the size: ");
        int size = scanner.nextInt();
        int[] array = creatArray(size);

        AlgorithmsSort algorithmsSort = new AlgorithmsSort();

        // buble sort
        usingBubleSortPrintAfterLoop(array, algorithmsSort);
        executionTimeBubleSort(100, algorithmsSort);
        executionTimeBubleSort(1000, algorithmsSort);
        executionTimeBubleSort(10000, algorithmsSort);
        executionTimeBubleSort(100000, algorithmsSort);
        System.out.println();

       // selection sort
        usingSelectionSortPrintAfterLoop(array, algorithmsSort);
        executionTimeSelectionSort(100, algorithmsSort);
        executionTimeSelectionSort(1000, algorithmsSort);
        executionTimeSelectionSort(10000, algorithmsSort);
        executionTimeSelectionSort(100000, algorithmsSort);
        System.out.println();

        // insertion sort
        usingInsertionSortPrintAfterLoop(array, algorithmsSort);
        executionTimeInsertSort(100, algorithmsSort);
        executionTimeInsertSort(1000, algorithmsSort);
        executionTimeInsertSort(10000, algorithmsSort);
        executionTimeInsertSort(100000, algorithmsSort);
        System.out.println();

        // quick sort
        usingQuickSortWithCount(array, algorithmsSort);
        executionTimeQuickSort(100, algorithmsSort);
        executionTimeQuickSort(1000, algorithmsSort);
        executionTimeQuickSort(10000, algorithmsSort);
        executionTimeQuickSort(100000, algorithmsSort);

        // merge sort
        usingMergeSortWithCount(array, algorithmsSort);
        executionTimeMergeSort(100, algorithmsSort);
        executionTimeMergeSort(1000, algorithmsSort);
        executionTimeMergeSort(10000, algorithmsSort);
        executionTimeMergeSort(100000, algorithmsSort);

    }
    public static void  usingBubleSortPrintAfterLoop(int[] array, AlgorithmsSort algorithmsSort) {
        System.out.println("buble sort");
        algorithmsSort.bubleSortPrintAfterEachLoop(array);
    }

    public static void executionTimeBubleSort(int size, AlgorithmsSort algorithmsSort) {
        long excutionTime = 0;
        for (int i = 0; i < 20; i++) {
            int[] array = creatArray(size);
            long startTime = System.nanoTime();
            algorithmsSort.bubleSort(array);
            long endTime = System.nanoTime();
            excutionTime = excutionTime + endTime - startTime;
        }

        System.out.println("excution time of buble sort with size = " + size + " is " + excutionTime/20 + " nanosecond");
    }

    public static void usingSelectionSortPrintAfterLoop(int[] array, AlgorithmsSort algorithmsSort) {
        System.out.println("selection sort");
        algorithmsSort.selectionSortPrintAfterLoop(array);
    }

    public static void executionTimeSelectionSort(int size, AlgorithmsSort algorithmsSort) {
        long excutionTime = 0;
        for (int i = 0; i < 20; i++) {
            int[] array = creatArray(size);
            long startTime = System.nanoTime();
            algorithmsSort.selectionSort(array);
            long endTime = System.nanoTime();
            excutionTime = excutionTime + endTime - startTime;
        }
        System.out.println("excution time of selection sort with size = " + size + " is " + excutionTime/20 + " nanosecond");
    }

    public static void usingInsertionSortPrintAfterLoop(int[] array, AlgorithmsSort algorithmsSort) {
        System.out.println("insertion sort");
        algorithmsSort.insertionSortPrintAfterLoop(array);
    }

    public static void executionTimeInsertSort(int size, AlgorithmsSort algorithmsSort) {
        long excutionTime = 0;
        for (int i = 0; i < 20; i++) {
            int[] array = creatArray(size);
            long startTime = System.nanoTime();
            algorithmsSort.insertionSort(array);
            long endTime = System.nanoTime();
            excutionTime = excutionTime + endTime - startTime;
        }

        System.out.println("excution time of insertion sort with size = " + size + " is " + excutionTime/20 + " nanosecond");
    }

    public static void usingQuickSortWithCount(int[] array, AlgorithmsSort algorithmsSort) {
        System.out.println("quick sort");
        algorithmsSort.quickSortWithCount(array, 0, array.length - 1);
        algorithmsSort.getCountCompareAndSwapQuickSort();
    }

    public static void executionTimeQuickSort(int size, AlgorithmsSort algorithmsSort) {
        long excutionTime = 0;
        for (int i = 0; i < 20; i++) {
            int[] array = creatArray(size);
            long startTime = System.nanoTime();
            algorithmsSort.quickSort(array, 0, array.length - 1);
            long endTime = System.nanoTime();
            excutionTime =excutionTime + endTime - startTime;
        }
        System.out.println("excution time of quick sort with size = " + size + " is " + excutionTime/20 + " nanosecond");
    }

    public static void usingMergeSortWithCount(int[] array, AlgorithmsSort algorithmsSort) {
        System.out.println("merge sort");
        algorithmsSort.mergeSortWithCount(array, 0, array.length-1);
        algorithmsSort.getCountCompareAndSwapMergeSort();
    }

    public static void executionTimeMergeSort(int size, AlgorithmsSort algorithmsSort) {
        long excutionTime = 0;
        for (int i = 0; i < 20; i++) {
            int[] array = creatArray(size);
            long startTime = System.nanoTime();
            algorithmsSort.mergeSort(array, 0, array.length - 1);
            long endTime = System.nanoTime();
            excutionTime =excutionTime + endTime - startTime;
        }
        System.out.println("excution time of merge sort with size = " + size + " is " + excutionTime/20 + " nanosecond");
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

    public static void printArray(int[] array) {
        for (int temp : array) {
            System.out.print(temp + " ");
        }
    }
}
