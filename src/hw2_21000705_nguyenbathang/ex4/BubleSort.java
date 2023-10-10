package hw2_21000705_nguyenbathang.ex4;

import java.util.Scanner;

public class BubleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        bubleSort(array);
        printArray(array);
    }
    public static void bubleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j-1] > array[j]) {
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void printArray(int[] array) {
        for (int temp : array) {
            System.out.print(temp + " ");
        }
    }
}
