package hw1_21000705_nguyenbathang.array;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap so luong phan tu: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        input(array, scanner);

        System.out.println("Prime is");
        printPrime(array);

        System.out.println("number divisible by 3 is");
        printDivisibleBy3(array);
    }

    public static void input(int[] a, Scanner scanner) {
        System.out.print("nhap cac gia tri cua mang: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
    }

    public static boolean checkPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void printPrime(int[] a){
        for (int i = 0; i < a.length; i++) {
            if (checkPrime(a[i])){
                System.out.println(a[i]);
            }
        }
    }

    // in cac phan tu chia het cho 3 trong mang
    public static void  printDivisibleBy3(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 3 == 0) {
                System.out.println(a[i]);
            }
        }
    }
}
