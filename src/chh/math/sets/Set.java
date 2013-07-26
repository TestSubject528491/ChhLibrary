package chh.math.sets;
import chh.math.logic.*;
/**
 *
 * @author  Christopher H. Harvey <chrisharvey2pi@gmail.com>
 * @version 2013.07.26
 */
public class Set extends Object {
	/**
	 * Constructs a new Set object.
	 */
	protected Set() {}
	
	/**
	 *
	 * @param x
	 * @return
	 */
	public Proposition contains(Set x) {
		return new Proposition(); // FIX THIS
	}
	/**
	 *
	 * @param x
	 * @return
	 */
	public Proposition elementOf(Set x) {
		return x.contains(this);
	}
	/**
	 *
	 * @param x
	 * @return
	 */
	public Proposition includes(Set x) {
		return new Proposition(); // FIX THIS
	}
	/**
	 *
	 * @param x
	 * @return
	 */
	public Proposition isSubsetOf(Set x) {
		return x.includes(this);
	}
	/**
	 *
	 * @param x
	 * @return
	 */
	public Proposition equals(Set x) {
		return new Conjunction(this.isSubsetOf(x),this.includes(x));
	}
	
	/**
	 *
	 * @return
	 */
	public Proposition isEmpty() {
		/* proposition p = for all x, x is not an element of this */
		return new Negation(); // FIX THIS
	}
}

