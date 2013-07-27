package chh.math.sets;
/**
 * Ordered Pair definition:
 * For all sets a and b, define {@code OrderedPair(a,b)} as {@code new Pair(new Singleton(a), new Pair(a,b))}.
 * <br />An OrderedPair is a Pair in which the order of the elements is relevant.
 * The order of these elements <strong>is relevant</strong>; that is,
 * {@code (new OrderedPair(a,b)).equals(new OrderedPair(b,a))} returns {@code false}.
 * @author  Christopher H. Harvey <chrisharvey2pi@gmail.com>
 * @version 2013.07.26
 */
public class OrderedPair extends Pair {
	/** The first coordinate. */
	private final Set abscissa;
	/** The second coordinate. */
	private final Set ordinate;
	
	/**
	 * Constructs a new OrderedPair object.
	 * @param abscissa the first coordinate
	 * @param ordinate the second coordinate
	 */
	public OrderedPair(Set abscissa, Set ordinate) {
		super(new Singleton(abscissa), new Pair(abscissa,ordinate));
		this.abscissa = abscissa;
		this.ordinate = ordinate;
	}
	/**
     * Returns whether the specified OrderedPair is equal to this OrderedPair.
	 * @param x the specified OrderedPair
	 * @return true if x has the same coordinates as this OrderedPair
	 */
	public boolean equals(OrderedPair x) {
		boolean coordinatesAreEqual = this.abscissa.equals(x.abscissa) && this.ordinate.equals(x.ordinate);
		return coordinatesAreEqual || this.equals((Pair) x);
	}
}
