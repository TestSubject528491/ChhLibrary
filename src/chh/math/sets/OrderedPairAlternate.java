package chh.math.sets;
/**
 * An OrderedPairAlternate is a set that encodes the order of its two components.
 * <p>The order of these elements <strong>is relevant</strong>; that is,
 * {@code (new OrderedPairAlternate(a,b)).equals(new OrderedPairAlternate(b,a))==false} (unless of course {@code a.equals(b)}), while
 * {@code (new Pair(a,b)).equals(new Pair(b,a))==true}.</p>
 * <p>An OrderedPairAlternate is similar to a {@see Tuple} with 2 components (a 2-tuple),
 * however they are structurally different from a set-theoretic approach.</p>
 * <p>{@code new OrderedPairAlternate(a,b)} is defined by ...</p>
 * @author  <a href="mailto:chrisharvey2pi@gmail.com">Christopher H. Harvey</a>
 * @version 2013.07.26
 */
public class OrderedPairAlternate extends Pair {
	/** The first coordinate. */
	private final Set abscissa;
	/** The second coordinate. */
	private final Set ordinate;
	
	/**
	 * Constructs a new OrderedPairAlternate object.
	 * @param abscissa the first coordinate
	 * @param ordinate the second coordinate
	 */
	public OrderedPairAlternate(Set abscissa, Set ordinate) {
//		super(abscissa?, new Pair(abscissa,ordinate));
		
		this.abscissa = abscissa;
		this.ordinate = ordinate;
	}
	/**
	 *
	 */
//	public OrderedPairAlternate(Set a) {
//		this(a, a);
//	}
	/**
	 *
	 */
//	public OrderedPairAlternate() {
//		this(new EmptySet(), new EmptySet());
//	}
	/**
     * Returns whether the specified OrderedPairAlternate is equal to this OrderedPairAlternate.
	 * @param x the specified OrderedPairAlternate
	 * @return true if x has the same coordinates as this OrderedPairAlternate
	 */
	public boolean equals(OrderedPairAlternate x) {
		boolean coordinatesAreEqual = this.abscissa.equals(x.abscissa) && this.ordinate.equals(x.ordinate);
		return coordinatesAreEqual || this.equals((Pair) x);
	}
}
