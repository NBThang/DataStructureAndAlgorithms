package hw2_21000705_nguyenbathang.ex4;

import java.util.Scanner;

public class InsertSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        insertSort(array);
        printArray(array);
    }
    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int next = array[i];
            int j;

            for (j = i - 1; j >= 0 && array[j] > next; j--) {
                array[j+1] = array[j];
            }
            array[j+1] = next;
        }
    }

    public static void printArray(int[] array) {
        for (int temp : array) {
            System.out.print(temp + " ");
        }
    }
}
