package chh.math.sets;
import chh.math.logic.*;
/**
 *
 * @author  Christopher H. Harvey <chrisharvey2pi@gmail.com>
 * @version 2013.07.26
 */
public class Subset extends Set {
	private final Set superset;
	/**
	 * Constructs a new Subset object.
	 * @param x
	 * @param p  
	 */
	public Subset(Set x, Proposition p) {
		super();
		this.superset = x;
	}
	/**
     * {@inheritDoc}
     */
    @Override
	public Proposition isSubsetOf(Set x) {
		return new Disjunction(new Proposition(this.superset.equals(x)), super.isSubsetOf(x));
	}
}
