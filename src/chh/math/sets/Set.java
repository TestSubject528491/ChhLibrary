package chh.math.sets;
/**
 * A set is that which may contain elements. These elements, in turn, are also sets.
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
	 * Returns whether this set owns the specified set.
	 * @param x the specified set
	 * @return true if x is an element of this set
	 */
	public abstract boolean contains(Set x);
	/**
	 * Returns whether this set has as a subset the specified set.
	 * The set x is a subset of a set y exactly when:
	 * for all sets t, if t is an element of x then t is an element of y.
	 * @param x the specified set
	 * @return true if x is a subset of this set
	 */
	protected abstract boolean includes(Set x);
	/**
	 * Returns whether the specified set has the same elements as this set.
	 * Two sets x and y are equal (have the same elements) exactly when:
	 * for all sets t, t is an element of x if and only if t is an element of y.
	 * @param x the specified set
	 * @return true if x is equal to this set
	 */
	public boolean equals(Set x) {
		boolean p = this.isEmpty() && x.isEmpty(); // speedy
		return p || (this.includes(x) && x.includes(this));
	}
	/**
	 * Returns whether this set has zero elements.
	 * A set y is empty exactly when:
	 * for all sets t, t is not an element of y.
	 * Although there is a class {@see EmptySet}, 
	 * some sets may have the <em>property</em> of being empty without 
	 * being an instance of the class, which is why this method was written.
	 * @see EmptySet
	 * @return true if this set has no elements
	 */
	public abstract boolean isEmpty();
//	public abstract boolean isInfinite();
}

