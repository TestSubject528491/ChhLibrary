package chh.math.sets;
/**
 * A set is that which may contain elements; these elements, in turn, are also sets.
 * @author  Christopher H. Harvey <chrisharvey2pi@gmail.com>
 * @version 2013.07.26
 */
public abstract class Set {
	/**
	 * Constructs a new Set object.
	 * Abstract classes shouldn't have constructors.
	 */
	//protected Set() {}
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
	 * @return true if x is a subset of this set
	 */
	public abstract boolean includes(Set x);
	/**
	 * Returns whether this set {@see includes(Set) includes} the specified EmptySet.
	 * If a set x is empty, then all its elements are members in this set,
	 * so x is a subset of this set.
	 * @param x the specified set
	 * @return true always
	 */
	public boolean includes(EmptySet x) {
		return true;
	}
	/**
	 * Returns whether the specified Set has the same elements as this Set.
	 * Two sets x and y are equal (have the same elements) exactly when:
	 * for all sets t, t is an element of x if and only if t is an element of y.
	 * @param x the specified set
	 * @return true if x is equal to this set
	 */
	public boolean equals(Set x) {
		boolean bothAreEmpty = this.isEmpty() && x.isEmpty();
		return bothAreEmpty || (this.includes(x) && x.includes(this));
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
	 *	<li>y contains an {@see EmptySet}</li>
	 *  <li>For every element t in y, y contains the {@see SuccessorSet} of t.
	 * </ol>
	 * Although there is a {@see InductiveSet} class,
	 * some Set objects may have the <em>property</em> of being inductive without 
	 * being an instance of the InductiveSet class.
	 * @return true if this set is inductive.
	 */
	public abstract boolean isInductive();
	
}

