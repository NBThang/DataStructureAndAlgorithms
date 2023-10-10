package hw3_21000705_nguyenbathang.ex1;

public class Fraction {
    private float numerator;
    private float denominator;

    public Fraction(float numerator, float denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction c) {
        float resuilNumerator = (this.numerator * c.getDenominator()) + (c.getNumerator() * this.denominator);
        float resuilDenominator = this.denominator * c.getDenominator();

        Fraction resuilFraction =  new Fraction(resuilNumerator, resuilDenominator);

        return normalize(resuilFraction);
    }

    public Fraction minus(Fraction c) {
        float resuilNumerator = (this.numerator * c.getDenominator()) - (c.getNumerator() * this.denominator);
        float resuilDenominator = this.denominator * c.getDenominator();

        return new Fraction(resuilNumerator, resuilDenominator);
    }

    public Fraction multi(Fraction c) {
        float resuilNumerator = this.numerator * c.getNumerator();
        float resuilDenimiator = this.denominator * c.getDenominator();

        return new Fraction(resuilNumerator, resuilDenimiator);
    }

    public Fraction divi(Fraction c) {
        float resuilNumerator = this.numerator * c.getDenominator();
        float resuilDenimiator = this.denominator * c.getNumerator();

        return new Fraction(resuilNumerator, resuilDenimiator);
    }

    public Fraction normalize(Fraction c) {
        float resuilNumerator = c.numerator;
        float  resultDenominator = c.denominator;
        while (isInteger(resuilNumerator) || isInteger(resultDenominator)) {
            resuilNumerator *= 10;
            resultDenominator *= 10;
        }

        int gcd = GCD((int) Math.abs(resultDenominator), (int) Math.abs(resultDenominator));

        resultDenominator = resultDenominator / gcd;
        resuilNumerator = resuilNumerator / gcd;

        Fraction resuilFaction = new Fraction(resuilNumerator, resultDenominator);
        return resuilFaction;
    }

    private static boolean isInteger(float number) {
        return (number == (int) number);
    }

    private int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }

    public float getNumerator() {
        return this.numerator;
    }

    public float getDenominator() {
        return this.denominator;
    }

    @Override
    public String toString() {
        return this.numerator + " / " + this.denominator;
    }
}