package chh.math.sets;

/**
 *
 * @author  Christopher H. Harvey <chrisharvey2pi@gmail.com>
 * @version 2013.07.26
 */
public class Union extends Set {
	/**
	 * Constructs a new Union object.
	 * @param x 
	 */
	public Union(Set x) {
		super(); // FIX THIS
	}
	/**
	 *
	 * @param x
	 * @param y
	 */
	public Union(Set x, Set y) {
		this(new Pair(x, y));
	}
}
