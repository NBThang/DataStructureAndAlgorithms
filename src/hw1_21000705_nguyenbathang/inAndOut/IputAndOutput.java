package hw1_21000705_nguyenbathang.inAndOut;

import java.util.Scanner;

public class IputAndOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap kieu so nguyen: ");
        int intNumber = sc.nextInt();
        System.out.print("nhap kieu so thuc: ");
        double doubleNumber = sc.nextDouble();


        boolean isBoy = true;

        System.out.print("nhap kieu String: ");
        String name = sc.next();

        System.out.println("so nguyen la: " + intNumber);
        System.out.println("so thuc la: " + doubleNumber);
        System.out.println("ban la nam?: " + isBoy);
        System.out.println("ten cua ban: " + name);
    }
}
