package chh.math.set;

/**
 *
 * @author  Christopher H. Harvey <chrisharvey2pi@gmail.com>
 * @version 2013.08.03
 */
public class NaturalNumber extends Successor {
	/** */
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
	 * Adds a natural number to this one and returns the sum.
	 * @param a a natural number to add
	 * @return the sum of {@code this} and {@code a}
	 */
//	public NaturalNumber addto(NaturalNumber a) {
//		return (a.isEmpty()) ? this : new NaturalNumber(this.addto(a.predecessor));
//	}
	/**
	 * Adds two natural numbers and returns the sum.
	 * @param a the first natural number
	 * @param b the second natural number
	 * @return the sum of {@code a} and {@code b}
	 */
	public static NaturalNumber add(NaturalNumber a, NaturalNumber b) {
		boolean aEmpty = a.isEmpty();
		boolean bEmpty = b.isEmpty();
		return aEmpty ? b : (bEmpty ? a :
				new NaturalNumber(NaturalNumber.add(a, b.predecessor)));
	}
	/**
	 * Multiplies two natural numbers and returns the product.
	 * @param a the first natural number
	 * @param b the second natural number
	 * @return the product of {@code a} and {@code b}
	 */
	public static NaturalNumber multiply(NaturalNumber a, NaturalNumber b) {
		boolean aEmpty = a.isEmpty();
		boolean bEmpty = b.isEmpty();
//		return aEmpty ? new NaturalNumber() : (bEmpty ? new NaturalNumber() :
//				NaturalNumber.add(NaturalNumber.multiply(a, b.predecessor), b.predecessor));
		return (aEmpty || bEmpty) ? new NaturalNumber() :
				NaturalNumber.add(NaturalNumber.multiply(a, b.predecessor), b.predecessor);
	}
}
