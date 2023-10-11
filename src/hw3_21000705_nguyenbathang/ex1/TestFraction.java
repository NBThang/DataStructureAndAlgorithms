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

        System.out.println();
        isRepeatingDecimal(new Fraction(24.3f, 17.2125f));
        isRepeatingDecimal(new Fraction(1, 2));

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

        System.out.print("sum of fractions is: " + sum.toString());
    }

    public static void minusFraction(List<Fraction> listFraction) {
        Fraction resuil = new Fraction(listFraction.get(0).getNumerator(),listFraction.get(0).getDenominator());
        for (int i=1; i < listFraction.size(); i++) {
            resuil = resuil.minus(listFraction.get(i));
        }

        System.out.print("minus of fractions is: " + resuil.toString());
    }

    public static void multiFraction(List<Fraction> listFraction) {
        Fraction resuil = new Fraction(1,1);
        for (Fraction temp : listFraction) {
            resuil = resuil.multi(temp);
        }

        System.out.print("multi of fractions is: " + resuil.toString());
    }

    public static void diviFraction(List<Fraction> listFraction) {
        Fraction resuil = new Fraction(listFraction.get(0).getNumerator(),listFraction.get(0).getDenominator());
        for (int i = 1; i < listFraction.size(); i++) {
            resuil =  resuil.divi(listFraction.get(i));
        }

        System.out.print("divi of fractions is: " + resuil.toString());
    }

    // * tự ra đề
    // kiểm tra phân số có phải phân số viết được dưới dạng số thập phân vô hạn tuần hoàn

    public static void isRepeatingDecimal(Fraction fraction) {
        fraction.normalize(fraction);
        List<Integer> listGCDPrimeDenominator = findGCDPrime((int) fraction.getDenominator());
        boolean check = false;
        for (int i = 0; i < listGCDPrimeDenominator.size(); i++) {
            if (listGCDPrimeDenominator.get(i) != 2 & listGCDPrimeDenominator.get(i) != 5) {
                check = true;
                break;
            }
        }

        if (check == true) {
            System.out.println(fraction.toString() + " is Repeating Decimal");
        } else {
            System.out.println(fraction.toString() + " is not Repeating Decimal");
        }
    }

    public static boolean isPrime(int number) {
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

    public static List findGCDPrime(int num) {
        List<Integer> listGCDPrime = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num%i == 0 & isPrime(i)) {
                listGCDPrime.add(i);
            }
        }
        return listGCDPrime;
    }

    public static void print(List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
