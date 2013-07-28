package chh.math.sets;

/**
 * An ordered n-tuple is a generalized concept of an ordered pair.
 * The ordered n-tuple is a set that encapsulates the order of its 
 * @author  Christopher H. Harvey <chrisharvey2pi@gmail.com>
 * @version 2013.07.27
 */
public abstract class OrderedNTuple extends Pair {
	/**
	 * Constructs a new OrderedNTuple object with no components (an ordered 0-tuple).
	 * This is equivalent to a singleton {{}} (a set that contains only the empty set).
	 */
//	public OrderedNTuple() {
		super(new EmptySet(), new EmptySet());
	}
	/**
	 * Constructs a new OrderedNTuple object with one component.
	 * This is equivalent to the set that contains only the ep
	 */
//	public OrderedNTuple(Set a) {
		super(a, a);
	}
}
