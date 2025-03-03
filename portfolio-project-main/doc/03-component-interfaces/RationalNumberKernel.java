import components.standard.Standard;
/**
 * Kernel interface for RationalNumber component.
 * This interface provides the minimal necessary methods to manipulate rational numbers.
 *
 * @author [Your Name]
 * @dotnumber [Your Dot Number]
 */
public interface RationalNumberKernel extends Standard<RationalNumber> {

    /**
     * Sets the numerator of this RationalNumber.
     *
     * @param numerator the numerator value
     * @updates this
     * @ensures this.numerator = numerator
     */
    void setNumerator(int numerator);

    /**
     * Sets the denominator of this RationalNumber.
     *
     * @param denominator the denominator value (must be non-zero)
     * @requires denominator != 0
     * @updates this
     * @ensures this.denominator = denominator
     */
    void setDenominator(int denominator);

    /**
     * Returns the numerator of this RationalNumber.
     *
     * @return the numerator value
     * @ensures getNumerator = this.numerator
     */
    int getNumerator();

    /**
     * Returns the denominator of this RationalNumber.
     *
     * @return the denominator value
     * @ensures getDenominator = this.denominator
     */
    int getDenominator();

    /**
     * Reduces this RationalNumber to its simplest form.
     *
     * @updates this
     * @ensures this is in reduced form (gcd(this.numerator, this.denominator) = 1)
     */
    void reduce();
}
