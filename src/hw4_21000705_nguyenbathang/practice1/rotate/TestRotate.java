package hw4_21000705_nguyenbathang.practice1.rotate;

import java.util.Scanner;

public class TestRotate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        inputArray(array, scanner);

        System.out.print("enter the number of rotations: ");
        int k = scanner.nextInt();

        Rotate rotate = new Rotate();
        int[] newArray = rotate.rotateArray(array, k);

        System.out.println("before rotate");
        printArray(array);
        System.out.println("after rotate");
        printArray(newArray);
    }
    public static void inputArray(int[] array, Scanner scanner) {
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

}
