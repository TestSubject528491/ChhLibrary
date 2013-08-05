package chh.math.set;

/**
 *
 * @author  Christopher H. Harvey <chrisharvey2pi@gmail.com>
 * @version 2013.08.03
 */
public class NaturalNumber extends Successor {
	/** The previous natural number, if it exists. */
	private NaturalNumber predecessor;
	/**
	 * Constructs a new NaturalNumber object 0 (the empty set).
	 */
	public NaturalNumber() {
		super();
	}
	/**
	 * Constructs a new NaturalNumber object from the previous one.
	 * Given a natural number {@code n}, this constructor returns the {@see Successor} of {@code n}.
	 * @param n the previous natural number
	 */
	public NaturalNumber(NaturalNumber n) {
		super(n);
		this.predecessor = n;
	}
	
	/**
	 * Adds two natural numbers and returns the sum.
	 * For two natural numbers x and y, the sum is defined:
	 * x + S(y) = S(x+y), and x + 0 = x , where
	 * S(y) is the successor of y and 0 is the empty set
	 * @param x the first natural number
	 * @param y the second natural number
	 * @return the sum of {@code x} and {@code y}
	 */
	public static NaturalNumber add(NaturalNumber x, NaturalNumber y) {
		boolean xEmpty = x.isEmpty();
		boolean yEmpty = y.isEmpty();
		return xEmpty ? y : (yEmpty ? x :
				new NaturalNumber(NaturalNumber.add(x, y.predecessor)));
	}
	/**
	 * Multiplies two natural numbers and returns the product.
	 * For two natural numbers x and y, the product is defined:
	 * x * S(y) = x*y + x, and x * 0 = 0 , where
	 * S(y) is the successor of y and 0 is the empty set
	 * @param x the first natural number
	 * @param y the second natural number
	 * @return the product of {@code x} and {@code y}
	 */
	public static NaturalNumber multiply(NaturalNumber x, NaturalNumber y) {
		boolean xEmpty = x.isEmpty();
		boolean yEmpty = y.isEmpty();
		NaturalNumber product = xEmpty ? new NaturalNumber() : (yEmpty ? new NaturalNumber() :
				NaturalNumber.add(NaturalNumber.multiply(x, y.predecessor), x));
		return (xEmpty || yEmpty) ? new NaturalNumber() :
				NaturalNumber.add(NaturalNumber.multiply(x, y.predecessor), x);
	}
	/**
	 * Raises one natural number to the power of the other and returns the power.
	 * For two natural numbers x and y, the power is defined:
	 * x ^ S(y) = x^y * x, and x ^ 0 = S(0) , where
	 * S(y) is the successor of y and 0 is the empty set
	 * @param x the first natural number
	 * @param y the second natural number
	 * @return {@code x} raised to the {@code y} power
	 */
	public static NaturalNumber power(NaturalNumber x, NaturalNumber y) {
		boolean xEmpty = x.isEmpty();
		boolean yEmpty = y.isEmpty();
		return xEmpty ? new NaturalNumber() : (yEmpty ? new NaturalNumber(new NaturalNumber()) :
				NaturalNumber.multiply(NaturalNumber.power(x, y.predecessor), x));
	}
}
