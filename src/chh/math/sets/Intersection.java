package chh.math.sets;
import chh.math.logic.*;
/**
 *
 * @author  Christopher H. Harvey <chrisharvey2pi@gmail.com>
 * @version 2013.07.26
 */
public class Intersection extends Subset {
	/**
	 * Constructs a new Intersection object.
	 * @param x 
	 */
	public Intersection(Set x) {
		super(new Union(x), new Proposition()); // FIX THIS
	}
	/**
	 *
	 * @param x
	 * @param y
	 */
	public Intersection(Set x, Set y) {
		this(new Pair(x, y));
	}
}
