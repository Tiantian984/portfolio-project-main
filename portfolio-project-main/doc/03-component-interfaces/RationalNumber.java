/**
 * Enhanced interface for RationalNumber component.
 * This interface extends the kernel and adds additional operations
 * like arithmetic operations.
 *
 * @author [Your Name]
 * @dotnumber [Your Dot Number]
 */
public interface RationalNumber extends RationalNumberKernel {

    /**
     * Adds the given RationalNumber to this RationalNumber.
     *
     * @param r the RationalNumber to add
     * @updates this
     * @ensures this = #this + r
     */
    void add(RationalNumber r);

    /**
     * Subtracts the given RationalNumber from this RationalNumber.
     *
     * @param r the RationalNumber to subtract
     * @updates this
     * @ensures this = #this - r
     */
    void subtract(RationalNumber r);

    /**
     * Multiplies this RationalNumber by the given RationalNumber.
     *
     * @param r the RationalNumber to multiply by
     * @updates this
     * @ensures this = #this * r
     */
    void multiply(RationalNumber r);

    /**
     * Divides this RationalNumber by the given RationalNumber.
     *
     * @param r the RationalNumber to divide by (numerator of r must not be zero)
     * @requires r.numerator != 0
     * @ensures this = #this / r
     * @return the result of division as a new RationalNumber
     */
    RationalNumber divide(RationalNumber r);
}
