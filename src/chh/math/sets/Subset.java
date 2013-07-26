package chh.math.sets;
import chh.math.logic.Proposition;
/**
 *
 * @author  Christopher H. Harvey <chrisharvey2pi@gmail.com>
 * @version 2013.07.26
 */
public abstract class Subset extends Set {
	/** */
	private final Set superset;
	/**
	 * Constructs a new Subset object.
	 * @param x
	 * @param p  
	 */
	public Subset(Set x, Proposition p) {
		this.superset = x;
		// FIX THIS
	}
	/**
	 *
	 * @param x
	 * @return
	 */
	public boolean isSubsetOf(Set x) {
		return this.superset.equals(x) || x.contains(this);
	}
}
