package hw1_21000705_nguyenbathang.array;

import java.util.Scanner;

public class ArrayGeneric <T>{
    public ArrayGeneric(){

    }


    public void input(T[] array){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap cac phan tu cua mang");
        for (int i = 0; i < array.length; i++) {
//            T value = (T) sc.nextLine();
//            setArray(i,value);
            array[i] = (T) sc.nextLine();
        }
    }
    public static boolean checkPrime(int number) {

            if (number < 2) {
                return false;
            }

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }

            return true;
    }

    public void printPrime(T[] array){
        if (isIntegerArray(array)) {
            for (Integer temp : (Integer[]) array) {
                if (checkPrime(temp.intValue())) {
                    System.out.print(temp + " ");
                }
            }
        } else {
            System.out.println("khong co");
        }
    }
    public static boolean isIntegerArray(Object array) {
        if (array instanceof int[]) {
            return true;
        } else if (array instanceof Integer[]) {
            return true;
        } else {
            return false;
        }
    }

    public void printArray(T[] array) {
        for (T temp : array) {
            System.out.print(temp + " ");
        }
    }

}
