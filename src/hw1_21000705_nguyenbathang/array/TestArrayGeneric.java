package hw1_21000705_nguyenbathang.array;

import java.util.Scanner;

public class TestArrayGeneric {
    public static void main(String[] args) {
        Integer[] integersArray = {1,2,3,4,5,6,7,8,9,10};
        ArrayGeneric<Integer> arrayInt = new ArrayGeneric<>();
        arrayInt.printArray(integersArray);
        System.out.print("\ncac so nguyen to trong mang la:");
        arrayInt.printPrime(integersArray);

        Double[] doublesArray = {1.2, 2.3, 3.4, 4.5};
        System.out.println();
        ArrayGeneric<Double> arrayDouble = new ArrayGeneric<>();
        arrayDouble.printArray(doublesArray);
        System.out.print("\ncac so nguyen to trong mang la: ");
        arrayDouble.printPrime(doublesArray);
    }

}
