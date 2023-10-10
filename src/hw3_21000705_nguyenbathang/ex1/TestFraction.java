package hw3_21000705_nguyenbathang.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestFraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the quantily fraction: ");
        int size = scanner.nextInt();

        List<Fraction> listFraction = new ArrayList<>();

        inputFraction(listFraction, size, scanner);

        System.out.print("enter the location you want to print: ");
        int location = scanner.nextInt();
        printFractionByIndex(listFraction, location);

        System.out.println();
        sumFraction(listFraction);

        System.out.println();
        minusFraction(listFraction);

        System.out.println();
        multiFraction(listFraction);

        System.out.println();
        diviFraction(listFraction);
    }

    public static void inputFraction(List<Fraction> listFraction, int size, Scanner scanner) {
        for (int i = 1; i <= size; i++) {
            System.out.print("enter numerator " + i + ": ");
            float numerator = scanner.nextFloat();
            System.out.print("enter denominator " + i + ": ");
            float denominator = scanner.nextFloat();
            listFraction.add(new Fraction(numerator, denominator));
        }
    }

    public static void printFractionByIndex(List<Fraction> listFraction, int index) {
        if (index < 1 || index > listFraction.size()) {
            throw new IndexOutOfBoundsException("Invalid index!");
        }

        System.out.println(listFraction.get(index - 1).toString());
    }

    public static void sumFraction(List<Fraction> listFraction) {
        Fraction sum = new Fraction(0,1);
        for (Fraction temp : listFraction) {
            sum = sum.add(temp);
        }

        System.out.print("sum of fractions is: " + sum.normalize().toString());
    }

    public static void minusFraction(List<Fraction> listFraction) {
        Fraction resuil = new Fraction(0,1);
        for (Fraction temp : listFraction) {
            resuil = resuil.minus(temp);
        }

        System.out.print("minus of fractions is: " + resuil.normalize().toString());
    }

    public static void multiFraction(List<Fraction> listFraction) {
        Fraction resuil = new Fraction(1,1);
        for (Fraction temp : listFraction) {
            resuil = resuil.multi(temp);
        }

        System.out.print("multi of fractions is: " + resuil.normalize().toString());
    }

    public static void diviFraction(List<Fraction> listFraction) {
        Fraction resuil = new Fraction(1,1);
        for (Fraction temp : listFraction) {
            resuil = resuil.divi(temp);
        }

        System.out.print("divi of fractions is: " + resuil.normalize().toString());
    }
}
