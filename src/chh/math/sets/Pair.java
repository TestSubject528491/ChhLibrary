package chh.math.sets;
import chh.math.logic.*;
/**
 *
 * @author  Christopher H. Harvey <chrisharvey2pi@gmail.com>
 * @version 2013.07.26
 */
public class Pair extends Set {
	/** */
	private final Set element1;
	/** */
	private final Set element2;
	/**
     * Constructs a new Pair object.
	 * @param x
	 * @param y  
	 */
    public Pair(Set x, Set y) {
		super();
		this.element1 = x;
		this.element2 = y;
	}
	/**
     * {@inheritDoc}
     */
    @Override
	public Proposition contains(Set x) {
		Proposition p = new Proposition(this.element1.equals(x));
		Proposition q = new Proposition(this.element2.equals(x));
		return new Disjunction(new Disjunction(p, q), super.contains(x));
	}
}

