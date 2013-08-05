package chh.math.set;
/**
 * The successor of a set x is defined as the union of x and the singleton containing x.
 * @author  Christopher H. Harvey <chrisharvey2pi@gmail.com>
 * @version 2013.08.03
 */
public class Successor extends Union {
	/** */
	private Set predecessor;
	/**
	 * Constructs a new Successor object from a set.
	 * @param x 
	 */
	public Successor(Set x) {
		super(x, new Singleton(x));
		this.predecessor = x;
	}
	/**
	 * Constructs a new EmptySet.
	 */
	Successor() {
		super();
	}
	/**
	 * Returns the Set of which this object is the Successor.
	 * @return the Set of which this object is the Successor
	 */
//	public Set getPredecessor() {
//		return this.predecessor;
//	}
}
