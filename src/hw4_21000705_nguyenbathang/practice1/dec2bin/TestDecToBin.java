package hw4_21000705_nguyenbathang.practice1.dec2bin;

import java.util.Scanner;

public class TestDecToBin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number: ");
        int decNumber = scanner.nextInt();

        Dec2Bin d2B = new Dec2Bin();
        String binNumber = d2B.DecToBin(decNumber);

        System.out.println("Dec: " + decNumber);
        System.out.println("Bin: " + binNumber);
    }
}
