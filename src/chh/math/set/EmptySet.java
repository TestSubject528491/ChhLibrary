package chh.math.set;
/**
 * <b>The Axiom of Existence:</b>
 * There exists a set that contains no elements; furthermore, this set is unique.
 * We symbolize this set by {}.
 * @author  <a href="mailto:chrisharvey2pi@gmail.com">Christopher H. Harvey</a>
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
	 * @return true if x is empty
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
	 * No EmptySet objects contain other Sets.
	 * @return false
     */
	@Override
	public boolean isSuccessorOf(Set x) {
		return false;
	}
	/**
     * {@inheritDoc}
	 * No EmptySet objects are inductive.
	 * @return false
	 */
	@Override
	public boolean isInductive() {
		return false;
	}
	/**
     * {@inheritDoc}
	 * @return {@code {}}
	 */
	@Override
	public String toString() {
		return "0";
	}
}
