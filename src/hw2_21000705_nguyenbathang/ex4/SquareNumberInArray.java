package hw2_21000705_nguyenbathang.ex4;

import java.util.*;

public class SquareNumberInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the size:");
        int size = scanner.nextInt();
        System.out.println("enter the array");
        int[] array = creatArray(size, scanner);

        sort(array);

        printSquareInArray(array);
    }

    public static void sort(int[] array) {
        // using buble sort
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

    public static boolean isSquare(int number) {
        if (number < 0) {
            return false;
        }

        int sqrt = (int) Math.sqrt(number);

        return sqrt * sqrt == number;
    }

    public static int[] creatArray(int size, Scanner sc) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static void printSquareInArray(int[] array) {
        List<Integer> listSquare = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (isSquare(array[i])) {
                listSquare.add(array[i]);
            }
        }

        for (int i = 0 ; i < listSquare.size() - 1; i++) {
            if (listSquare.get(i) == listSquare.get(i+1)) {
                listSquare.remove(i);
            }
        }

        for (int i = 0; i < listSquare.size(); i++) {
            System.out.print(listSquare.get(i) + " ");
        }

    }

}
