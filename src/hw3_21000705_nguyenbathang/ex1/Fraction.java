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

        Fraction resuilFraction =  new Fraction(resuilNumerator, resuilDenominator);

        return normalize(resuilFraction);
    }

    public Fraction multi(Fraction c) {
        float resuilNumerator = this.numerator * c.getNumerator();
        float resuilDenimiator = this.denominator * c.getDenominator();

        Fraction resuilFraction =  new Fraction(resuilNumerator, resuilDenimiator);

        return normalize(resuilFraction);
    }

    public Fraction divi(Fraction c) {
        float resuilNumerator = this.numerator * c.getDenominator();
        float resuilDenimiator = this.denominator * c.getNumerator();

        Fraction resuilFraction =  new Fraction(resuilNumerator, resuilDenimiator);

        return normalize(resuilFraction);
    }

    public Fraction normalize(Fraction c) {
        float tempNumerator = c.numerator;
        float tempDenominator = c.denominator;
        while (!isInteger(tempNumerator) || !isInteger(tempDenominator)) {
            tempNumerator *= 10;
            tempDenominator *= 10;
        }
        int gcd = gcd((int) tempNumerator, (int) tempDenominator);

        int numeratorNormalize = (int) tempNumerator / gcd;
        int denominatorNormalize = (int) tempDenominator / gcd;
        return new Fraction(numeratorNormalize, denominatorNormalize);
    }

    private static boolean isInteger(float number) {
        return number % 1 == 0;
    }

    private int gcd(int a, int b) {
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }

    public float getNumerator() {
        return this.numerator;
    }

    public float getDenominator() {
        return this.denominator;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();

        int tempNumerator = (int) numerator;
        int tempDenominator = (int) denominator;

        if (tempDenominator< 0) {
            if (numerator > 0) {
                sb.append(-tempNumerator + "/" + -tempDenominator);
            }
        } else if (tempDenominator == 0) {
            sb.append(0);
        } else {
            sb.append(tempNumerator + "/" + tempDenominator);
        }
        return sb.toString();
    }
}