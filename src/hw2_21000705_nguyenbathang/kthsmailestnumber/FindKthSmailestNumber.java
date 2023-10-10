package hw2_21000705_nguyenbathang.kthsmailestnumber;

import java.util.Scanner;

public class FindKthSmailestNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size: ");
        int size = sc.nextInt();
        int[] array = creatArray(size, sc);

        System.out.print("enter the k: ");
        int k = sc.nextInt();

        if (k > size || k < 1) {
            System.out.println("no find " + k + "th in array!");
        } else{
            System.out.println(k + "th smailest number is: " + findKthSmailestNumber(array, k));
        }
    }

    public static int[] creatArray(int size, Scanner sc) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static int findKthSmailestNumber(int[] array, int k) {
        sort(array);
        return array[k - 1];
    }
    public static void sort(int[] array) {
        // using insertion sort
        for (int i = 1; i < array.length; i++) {
            int next = array[i];
            int j;

            for (j = i - 1; j >= 0 && array[j] > next; j--) {
                array[j+1] = array[j];
            }
            array[j+1] = next;
        }
    }
}
