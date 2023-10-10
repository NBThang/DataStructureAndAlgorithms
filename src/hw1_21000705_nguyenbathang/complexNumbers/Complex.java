package hw1_21000705_nguyenbathang.complexNumbers;

public class Complex {
    protected double real;
    protected double imag;

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex(){

    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void printComplex() {
        if(this.getImag() >= 0 ) {
            System.out.println(this.getReal() + " + " + this.getImag() + "i");
        } else {
            System.out.println(this.getReal() + " - " + Math.abs(this.getImag()) + "i");
        }
    }

    public Complex addComplex(Complex complex) {
        double newReal = this.getReal() + complex.getReal();
        double newImag = this.getImag() + complex.getImag();
        return new Complex(newReal, newImag);
    }

    public Complex multiComplex(Complex complex) {
        double newReal = this.getReal() * complex.getReal() - this.getImag() * complex.getImag();
        double newImag = this.getReal() * complex.getImag() + this.getImag() * complex.getReal();
        return new Complex(newReal, newImag);
    }

    @Override
    public String toString() {
        if(this.getImag() >= 0 ) {
            return this.getReal() + " + " + this.getImag() + "i";
        }
        return this.getReal() + " - " + Math.abs(this.getImag()) + "i";
    }
}
