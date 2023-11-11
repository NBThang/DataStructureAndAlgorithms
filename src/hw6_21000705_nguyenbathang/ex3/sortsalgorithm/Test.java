package hw6_21000705_nguyenbathang.ex3.sortsalgorithm;

import java.util.Random;
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the size array: ");
        int size = scanner.nextInt();

        Integer[] array = creatIntegerArray(size);

        SortAlgorithm<Integer > sortAlgorithm = new SortAlgorithm<>();

        printArray(array);

//        sortAlgorithm.executionTimeBubleSort(array.clone());
//
//        sortAlgorithm.executionTimeInsertSort(array.clone());
//
//        sortAlgorithm.executionTimeSelectionSort(array.clone());
//
//        sortAlgorithm.executionTimeQuickSort(array.clone());
//
//        sortAlgorithm.executionTimeMergeSort(array.clone());

        sortAlgorithm.heapSort(array);
        printArray(array);
    }

    public static Integer[] creatIntegerArray(int size) {
        Integer[] arr = new Integer[size];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(size);
        }

        return arr;
    }

    public static void printArray(Integer[] array) {
        for (int temp : array) {
            System.out.print(temp + " ");
        }
        System.out.println();
    }

    public static void paintChart() {

    }

}
