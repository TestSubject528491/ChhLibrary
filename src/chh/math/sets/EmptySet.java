package chh.math.sets;
import chh.math.logic.*;
/**
 *
 * @author  Christopher H. Harvey <chrisharvey2pi@gmail.com>
 * @version 2013.07.26
 */
public class EmptySet extends Set {
	/**
	 * Constructs a new EmptySet object.
	 */
	public EmptySet() {super();}
	
	/**
     * {@inheritDoc}
     */
    @Override
	public Proposition contains(Set x) {
		return new Negation();
	}
	/**
     * {@inheritDoc}
     */
    @Override
	public Proposition isSubsetOf(Set x) {
		return new Proposition();
	}
	/**
     * {@inheritDoc}
     */
    @Override
	public Proposition equals(Set x) {
		return new Disjunction(new Proposition(), super.equals(x));
	}
	/**
     * {@inheritDoc}
     */
	@Override
	public Proposition isEmpty() {
		return new Proposition();
	}
}
