public class RationalNumber {

    private int numerator;
    private int denominator;

    // Kernel Methods
    public void setNumerator(int n) {
        this.numerator = n;
    }

    public void setDenominator(int d) {
        if (d == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.denominator = d;
    }

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public void reduce() {
        int gcd = gcd(this.numerator, this.denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;
    }

    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    // Secondary Methods
    public void add(RationalNumber r) {
        int newNumerator = this.numerator * r.getDenominator() + r.getNumerator() * this.denominator;
        int newDenominator = this.denominator * r.getDenominator();
        this.numerator = newNumerator;
        this.denominator = newDenominator;
        reduce();
    }

    public void subtract(RationalNumber r) {
        int newNumerator = this.numerator * r.getDenominator() - r.getNumerator() * this.denominator;
        int newDenominator = this.denominator * r.getDenominator();
        this.numerator = newNumerator;
        this.denominator = newDenominator;
        reduce();
    }

    public void multiply(RationalNumber r) {
        this.numerator *= r.getNumerator();
        this.denominator *= r.getDenominator();
        reduce();
    }

    public RationalNumber divide(RationalNumber r) {
        if (r.getNumerator() == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        RationalNumber result = new RationalNumber();
        result.setNumerator(this.numerator * r.getDenominator());
        result.setDenominator(this.denominator * r.getNumerator());
        result.reduce();
        return result;
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        RationalNumber r1 = new RationalNumber();
        r1.setNumerator(1);
        r1.setDenominator(2);

        RationalNumber r2 = new RationalNumber();
        r2.setNumerator(3);
        r2.setDenominator(4);

        System.out.println("r1: " + r1.getNumerator() + "/" + r1.getDenominator());
        System.out.println("r2: " + r2.getNumerator() + "/" + r2.getDenominator());

        r1.add(r2);
        System.out.println("r1 + r2: " + r1.getNumerator() + "/" + r1.getDenominator());

        r1.subtract(r2);
        System.out.println("r1 - r2: " + r1.getNumerator() + "/" + r1.getDenominator());

        r1.multiply(r2);
        System.out.println("r1 * r2: " + r1.getNumerator() + "/" + r1.getDenominator());

        RationalNumber r3 = r1.divide(r2);
        System.out.println("r1 / r2: " + r3.getNumerator() + "/" + r3.getDenominator());
    }
}