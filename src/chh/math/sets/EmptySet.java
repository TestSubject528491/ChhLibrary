package chh.math.sets;
/**
 * The Axiom of Existence:
 * There exists a set {} that contains no elements; furthermore, this set is unique.
 * <br />That is, there exists a set e such that:
 * for all sets x, (for all sets t, {@code x.contains(t)==false} if and only if {@code e.equals(x)}).
 * We symbolize the set e by {}.
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
	 * All EmptySet objects are empty by definition.
	 * @return false
     */
    @Override
	public boolean contains(Set x) {
		return false;
	}
	/**
     * {@inheritDoc}
	 * The only subsets of this set are empty sets.
	 * @return 
     */
    @Override
	public boolean includes(Set x) {
		return x.isEmpty();
	}
	/**
     * {@inheritDoc}
	 * All EmptySet objects are empty.
	 * @return true
     */
	@Override
	public boolean isEmpty() {
		return true;
	}
	/**
     * {@inheritDoc}
	 * No EmptySet objects are inductive.
	 * @return false
	 */
//	@Override
//	public boolean isInductive() {
//		return false;
//	}
	/**
     * {@inheritDoc}
	 * @return {@code {}}
	 */
	@Override
	public String toString() {
		return "{}";
	}
}
