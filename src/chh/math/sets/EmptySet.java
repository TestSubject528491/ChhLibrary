package chh.math.sets;
/**
 *
 * @author  Christopher H. Harvey <chrisharvey2pi@gmail.com>
 * @version 2013.07.26
 */
public class EmptySet extends Set {
	/**
	 * Constructs a new EmptySet object.
	 */
	public EmptySet() {}
	
	/**
     * {@inheritDoc}
	 * This set does not contain any element x,
	 * because all EmptySet objects are empty by definition.
     */
    @Override
	public boolean contains(Set x) {
		return false;
	}
	/**
     * {@inheritDoc}
	 * If x is empty, then all its elements are members in this set.
	 * (In fact, if x is empty then it is a subset of every set.)
     */
    @Override
	public boolean includes(Set x) {
		return x.isEmpty();
	}
	/**
     * {@inheritDoc}
	 * If x is empty, it is equal to this object.
     */
    @Override
	public boolean equals(Set x) {
		return x.isEmpty();
	}
	/**
     * {@inheritDoc}
	 * All EmptySet objects are empty.
     */
	@Override
	public boolean isEmpty() {
		return true;
	}
}
