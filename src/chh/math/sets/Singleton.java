package chh.math.sets;
import chh.math.logic.*;

/**
 *
 * @author  Christopher H. Harvey <chrisharvey2pi@gmail.com>
 * @version 2013.07.26
 */
public class Singleton extends Pair {
	/** */
	private final Set element;
	
	/**
	 * Constructs a new Singleton object.
	 * @param x 
	 */
	public Singleton(Set x) {
		super(x, x);
		this.element = x;
	}
	
	/**
     * {@inheritDoc}
     */
    @Override
	public Proposition contains(Set x) {
		return new Disjunction(new Proposition(this.element.equals(x)), super.contains(x));
	}
}
