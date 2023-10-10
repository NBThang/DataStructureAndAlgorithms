package hw1_21000705_nguyenbathang.complexNumbers;


import java.util.List;

public class OperationComplex{

    public OperationComplex(){

    }

    // cong 2 so phuc
    public Complex addComplex(Complex complex1, Complex complex2) {
        double newReal = complex1.getReal() + complex2.getReal();
        double newImag = complex1.getImag() + complex2.getImag();
        return new Complex(newReal, newImag);
    }

    // cong nhieu so phuc
    public Complex addAllComplex(List<Complex> listComplex) {
        Complex sum = listComplex.get(0);
        for (int i = 1; i < listComplex.size(); i++) {
            sum = sum.addComplex(listComplex.get(i));
        }
        return sum;
    }

    // nhan 2 so phuc
    public Complex multiComplex(Complex complex1, Complex complex2) {
        double newReal = complex1.getReal() * complex2.getReal() - complex1.getImag() * complex2.getImag();
        double newImag = complex1.getReal() * complex2.getImag() + complex1.getImag() * complex2.getReal();
        return new Complex(newReal, newImag);
    }

    // nhan nhieu so phuc
    public Complex multiplyAllComplex(List<Complex> listComplex) {
        Complex resuil = listComplex.get(0);
        for (int i = 1; i < listComplex.size(); i++) {
            resuil = resuil.multiComplex(listComplex.get(i));
        }
        return resuil;
    }

}
