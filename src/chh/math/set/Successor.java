package chh.math.set;
/**
 * The successor of a set x is defined as the union of x and the singleton containing x.
 * @author  Christopher H. Harvey <chrisharvey2pi@gmail.com>
 * @version 2013.12.08
 */
public class Successor extends Union {
	/** The set of which this object is a successor. */
	private Set predecessor;
	/**
	 * Constructs a new Successor object from a set.
	 * @param x the set of which to construct this successor
	 */
	public Successor(Set x) {
		super(x, new Singleton(x));
		this.predecessor = x;
	}
	/**
	 * Constructs a new Successor of the empty set.
	 * <p>The successor of the empty set is defined as the union of the empty set and the singleton containing the empty set.
	 * In other words, if we denote the empty set with the number 0, then the successor of 0 is {0}, which we define to be the number 1. Thus {@code new Successor()} constructs the number 1</p>
	 */
	public Successor() {
		this(new EmptySet());
	}
	/**
	 * Returns the Set of which this object is the Successor.
	 * @return the Set of which this object is the Successor
	 */
//	public Set getPredecessor() {
//		return this.predecessor;
//	}
}
