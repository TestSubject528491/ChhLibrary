package chh.math.sets;
/**
 * The Axiom of Pair:
 * Given two sets x and y, there exists a set {x,y} that contains exactly them both.
 * The order of these elements is not relevant; that is,
 * {@code (new Pair(a,b)).equals(new Pair(b,a))}, and 
 * {@code (new Pair(a,b)).equals(new Pair(b,a))} both return {@code true}.
 * @author  Christopher H. Harvey <chrisharvey2pi@gmail.com>
 * @version 2013.07.26
 */
public class Pair extends Set {
	/** One element of this set. */
	private final Set element1;
	/** Another element of this set. */
	private final Set element2;
	/**
     * Constructs a new Pair object.
	 * 
	 * The order of parameters is irrelevant.
	 * @param x one element of this set
	 * @param y another element of this set
	 */
    public Pair(Set x, Set y) {
		this.element1 = x;
		this.element2 = y;
	}
	/**
	 * Constructs a new Pair object, as a {@see Singleton}.
	 * @param x an (the only) element of this set
	 */
	Pair(Set x) {
		this(x, x);
	}
	/**
	 * Constructs a new Pair object, as a {@see Singleton} containing an {@see EmptySet}.
	 */
	Pair() {
		this(new EmptySet());
	}
	/**
     * {@inheritDoc}
	 * A Pair contains exactly its elements.
     */
    @Override
	public boolean contains(Set x) {
		return x.equals(this.element1) || x.equals(this.element2);
	}
	/**
     * {@inheritDoc}
     */
	@Override
	public boolean includes(Set x) {
		return x.isEmpty() || x.equals(new Singleton(this.element1)) || x.equals(new Singleton(this.element2)) || x.equals(this);
	}
	/**
	 * Returns whether this Pair {@see includes(Set) includes} the specified Pair.
	 * An ordered pair (a,b) includes an ordered pair (c,d) 
	 * The set x is a subset of a set y exactly when:
	 * for all sets t, if t is an element of x then t is an element of y.
	 * Although there is a class {@see Subset}, 
	 * some sets may have the <em>property</em> of being a subset of this one without 
	 * being an instance of the Subset class.
	 * @see includes(Set)
	 * @param x
	 * @return
	 */
	private boolean includes(Pair x) {
		return this.contains(x.element1) && this.contains(x.element2);
	}
	/**
     * Returns whether the specified Pair is equal to this Pair.
	 * @param x the specified Pair
	 * @return true if this set contains both elements of x
	 * (it is implied that if this set contains both elements of x, then
	 * it contains <em>only</em> elements of x,
	 * because it cannot contain any other elements)
	 */
	public boolean equals(Pair x) {
		return this.includes(x) || this.equals((Set) x);
		/*
		 * Alternate version 1:
		 * boolean p = this.element1.equals(x.element1);
		 * boolean q = this.element2.equals(x.element2);
		 * boolean r = this.element1.equals(x.element2);
		 * boolean s = this.element2.equals(x.element1);
		 * return (p && q) || (r && s) || this.equals((Set) x);
		 * 
		 * Alternate version 2:
		 * boolean p = (new Pair(this.element1,this.element2)).equals(new Pair(x.element1,x.element2));
		 * boolean q = (new Pair(this.element1,this.element2)).equals(new Pair(x.element2,x.element1));
		 * return p || q || this.equals((Set) x);
		 */
	}
	/**
     * {@inheritDoc}
	 * A Pair is always nonempty.
	 * @return false
     */
	@Override
	public boolean isEmpty() {
		return false;
	}
	/**
     * {@inheritDoc}
	 * No Pair objects are inductive.
	 * @return false
	 */
	@Override
	public boolean isInductive() {
		return false;
	}
}