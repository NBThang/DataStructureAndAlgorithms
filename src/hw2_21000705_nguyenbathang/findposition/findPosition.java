package hw2_21000705_nguyenbathang.findposition;

import java.util.Scanner;

public class findPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the size: ");
        int size = scanner.nextInt();
        System.out.println("enter the array");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("enter the idex: ");
        int idex = scanner.nextInt();
        if (idex >=0 && idex < size - 1) {
            System.out.println("value at position in " + idex + " is " + array[idex]);
            System.out.println("after sort " + array[idex] + " in position " + findPositionInSortedArray(array, idex));
        }
    }
    public static int findPositionInSortedArray(int[] array, int index) {
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < sortedArray.length; i++) {
            sortedArray[i] = array[i];
        }

        bubleSort(sortedArray);

        for (int j = 0; j < sortedArray.length; j++) {
            if (sortedArray[j] == array[index]) {
                return j;
            }
        }

        return -1;
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
}
