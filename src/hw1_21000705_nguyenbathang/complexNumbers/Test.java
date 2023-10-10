package hw1_21000705_nguyenbathang.complexNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // nhap 1 list chua so phuc
        List<Complex> listComplex = inputComplex(sc);

        // cong 2 so phuc
        add2Complex(listComplex);

        // nhan hai so phuc
        multy2Complex(listComplex);

        // cong nhieu so phuc
        addAllComplex(listComplex);

        // nhan nhieu so phuc
        multiAllComplex(listComplex);
    }

    public static List<Complex> inputComplex(Scanner sc) {
        System.out.print("enter quantity Complex number: ");
        int size = sc.nextInt();
        List<Complex> listComplex = new ArrayList<>();

        for (int i = 1; i <= size; i++) {
            System.out.print("real of complex number " + i + ":");
            double real = sc.nextDouble();
            System.out.print("imag of complex number " + i + ":");
            double imag = sc.nextDouble();
            listComplex.add(new Complex(real, imag));
        }

        return listComplex;
    }

    public static void add2Complex(List<Complex> listComplex){
        OperationComplex operationComplex = new OperationComplex();
        try {
            Complex resuilComplex =  operationComplex.addComplex(listComplex.get(0), listComplex.get(1));
            System.out.println("(" + listComplex.get(0).toString() +
                    ") + (" + listComplex.get(1).toString() + ") = " +
                    resuilComplex.toString());
        } catch (IndexOutOfBoundsException e){
            System.out.println("ERROR");
            // xu ly ngoai le khi listComplex.get(index) khong ton tai
        }
    }

    public static void multy2Complex(List<Complex> listComplex) {
        OperationComplex operationComplex = new OperationComplex();
        try {
            Complex resuilComplex =  operationComplex.multiComplex(listComplex.get(0), listComplex.get(1));
            System.out.println("(" + listComplex.get(0).toString() +
                    ") x (" + listComplex.get(1).toString() + ") = " +
                    resuilComplex.toString());
        } catch (IndexOutOfBoundsException e){
            System.out.println("ERROR");
            // xu ly ngoai le khi listComplex.get(index) khong ton tai
        }
    }

    public static void addAllComplex(List<Complex> listComplex) {
        OperationComplex operationComplex = new OperationComplex();
        Complex resuil =  operationComplex.addAllComplex(listComplex);
        System.out.println("tong cua cac so phuc trong danh sach la: " + resuil.toString());
    }

    public static void multiAllComplex(List<Complex> listComplex) {
        OperationComplex operationComplex = new OperationComplex();
        Complex resuil =  operationComplex.multiplyAllComplex(listComplex);
        System.out.println("tich cua cac so phuc trong danh sach la: " + resuil.toString());
    }
}
