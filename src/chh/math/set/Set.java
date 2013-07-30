package chh.math.set;
/**
 * A set is that which may contain elements; these elements, in turn, are also sets.
 * @author  <a href="mailto:chrisharvey2pi@gmail.com">Christopher H. Harvey</a>
 * @version 2013.07.26
 */
public abstract class Set {
	/**
	 * Constructs a new Set object.
	 * Abstract classes shouldn't have constructors.
	 */
//	private Set() {}
	/**
	 * Returns whether this set owns the specified set as an element.
	 * @param x the specified set
	 * @return true if x is an element of this set
	 */
	public abstract boolean contains(Set x);
	/**
	 * Returns whether this Set has the specified Set as a subset.
	 * The set x is a subset of a set y exactly when "all the elements of x are in y", that is:
	 * for all sets t, if t is an element of x then t is an element of y.
	 * Although there is a {@see Subset} class,
	 * some Set objects may have the <em>property</em> of being a subset of this one without 
	 * being an instance of the Subset class.
	 * @see Subset
	 * @param x the specified set
	 * @return true if this set contains all the elements of x
	 */
	public abstract boolean includes(Set x);
	/**
	 * Returns whether the specified Set has the same elements as this Set.
	 * Two sets x and y are equal (have the same elements) exactly when they include each other:
	 * for all sets t, t is an element of x if and only if t is an element of y.
	 * If x is empty, and this set is empty, they are equal.
	 * @see includes(Set)
	 * @param x the specified set
	 * @return true if x and this set are both empty, or this set and x include each other
	 */
	public boolean equals(Set x) {
		boolean bothEmpty = x.isEmpty() && this.isEmpty(); // a convenience statement to speed computation
		return bothEmpty || (this.includes(x) && x.includes(this));
	}
	/**
	 * Returns whether this Set has no elements.
	 * A set y is empty exactly when:
	 * for all sets t, t is not an element of y.
	 * Although there is a {@see EmptySet} class,
	 * some Set objects may have the <em>property</em> of being empty without 
	 * being an instance of the EmptySet class.
	 * @see EmptySet
	 * @return true if this set has no elements
	 */
	public abstract boolean isEmpty();
	/**
	 * Returns whether this set is inductive.
	 * A set y is inductive iff:
	 * <ol>
	 *	<li>{@code y.contains(new EmptySet())}</li>
	 *  <li>for all sets t, if {@code y.contains(t)} then {@code y.contains(new SuccessorSet(t))}</li>
	 * </ol>
	 * Although there is a {@see InductiveSet} class,
	 * some Set objects may have the <em>property</em> of being inductive without 
	 * being an instance of the InductiveSet class.
	 * @see EmptySet
	 * @see SuccessorSet
	 * @return true if this set is inductive
	 */
//	public abstract boolean isInductive();
	
	/**
     * {@inheritDoc}
	 * @return the set-theoretic representation of this object
     */
    @Override
	public abstract String toString();
}

