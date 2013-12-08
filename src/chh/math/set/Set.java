package chh.math.set;
/**
 * A set is that which may contain elements; these elements, in turn, are also sets.
 * @author  <a href="mailto:chrisharvey2pi@gmail.com">Christopher H. Harvey</a>
 * @version 2013.12.08
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
	 * <p>Although there is a {@see Subset} class,
	 * some Set objects may have the <em>property</em> of being a subset of this one without 
	 * being an instance of the Subset class.</p>
	 * @see Subset
	 * @param x the Set that this Set includes or not
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
		boolean sameObject = (this == x); // a convenience statement: equal Java objects are equal sets (but not vice versa)
		boolean bothEmpty = x.isEmpty() && this.isEmpty(); // a convenience statement to speed computation
		boolean containEachOther = this.includes(x) && x.includes(this); // definition of set equality
		return sameObject || bothEmpty || containEachOther;
	}
	/**
	 * Returns whether this Set has no elements.
	 * A set y is empty exactly when:
	 * for all sets t, t is not an element of y.
	 * <p>Although there is a {@see EmptySet} class,
	 * some Set objects may have the <em>property</em> of being empty without 
	 * being an instance of the EmptySet class.</p>
	 * @see EmptySet
	 * @return true if this set has no elements
	 */
	public abstract boolean isEmpty();
	/**
	 * Returns whether this Set contains the empty set.
	 * @see EmptySet
	 * @return true if the empty set is an element of this set
	 */
	public boolean containsEmpty() {
		return this.contains(new EmptySet());
	}
	/**
	 * Returns whether this Set contains one unique element.
	 * A set y contains one unique element x exactly when:
	 * x is an element of y, and for all sets a and b that are elements of y, a.equals(b).
	 * <p>Although there is a {@see Singleton} class,
	 * some Set objects may have the <em>property</em> of being a singleton without 
	 * being an instance of the Singleton class.</p>
	 * @see Singleton
	 * @return true if this set contains exactly one element
	 */
	public abstract boolean isSingleton();
	/**
	 * Returns whether this Set contains one unique element specified as a parameter.
	 * @see Singleton
	 * @see isSingleton()
	 * @param x the Set of which this set may or may not contain
	 * @return true if this set contains x and no other elements
	 */
	public boolean isSingletonOf(Set x) {
		return this.isSingleton() && this.contains(x);
	}
	/**
	 * Returns whether this set contains exactly two elements (which may be equal).
	 * A set x is a pair if and only if there exists a set a in x, and a set b in x, and for all sets y in x, y=a or y=b.
	 * <p>Although there is a {@see Pair} class,
	 * some Set objects may have the <em>property</em> of being a pair without
	 * being an instance of the Pair class.</p>
	 * <p>If both elements of this set are equal, then {@code this.isSingleton()==true}.
	 * If {@code this.isSingleton()==true} then {@code this.isPair()==true}
	 * (but the converse is not necessarily the case).</p>
	 * @see Pair
	 * @see isSingleton()
	 * @return true if this set contains exactly two elements (which may be equal).
	 */
	public abstract boolean isPair();
	/**
	 * Returns whether this Set contains two elements specified as parameters.
	 * @see Pair
	 * @see isPair()
	 * @param x a Set of which this set may or may not contain
	 * @param y a Set of which this set may or may not contain
	 * @return true if this contains x and y and no other elements
	 */
	public boolean isPairOf(Set x, Set y) {
		return this.isPair() && this.contains(x) && this.contains(y);
	}
	/**
	 * Returns whether this Set is the successor of the specified Set.
	 * The {@see Successor} of a set is constructed by taking the {@see Union} of:
	 * <ol>
	 * <li>that set, and</li>
	 * <li>the {@see Singleton} of that set</li>
	 * </ol>
	 * Consequently, this set is the successor of a set x if and only if:
	 * this set contains x, and this set includes x.
	 * <p>Although there is a {@see Successor} class,
	 * some Set objects may have the <em>property</em> of being a successor without 
	 * being an instance of the Successor class.</p>
	 * @param x the Set of which this Set is or is not the successor
	 * @return true if this set is the successor of x
	 */
	public boolean isSuccessorOf(Set x) {
		return (this.contains(x) && this.includes(x));
	}
	/**
	 * Returns whether this set is a powerset of the specified parameter.
	 * For a set x, the power set of x is the set that only contains all subsets of x.
	 * <p>Although there is a {@see PowerSet} class,
	 * some Set objects may have the <em>property</em> of being a power set without 
	 * being an instance of the PowerSet class.</p>
	 * @param x the set of which this set may be a power set
	 * @return true if this set is a power set of x
	 */
	public abstract boolean isPowerSetOf(Set x);
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
	public abstract boolean isInductive();
	
	/**
     * {@inheritDoc}
	 * @return the set-theoretic representation of this object
     */
    @Override
	public abstract String toString();
}

