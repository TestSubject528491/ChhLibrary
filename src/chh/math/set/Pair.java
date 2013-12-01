package chh.math.set;
/**
 * The Axiom of Pair:
 * Given two sets, there exists a set that contains exactly them both.
 * <p>The order of these elements is <strong>not relevant</strong>; that is,
 * {@code (new Pair(a,b)).equals(new Pair(b,a))==true}.</p>
 * @author  <a href="mailto:chrisharvey2pi@gmail.com">Christopher H. Harvey</a>
 * @version 2013.07.26
 */
public class Pair extends Set {
	/** One element of this Pair. */
	private final Set element1;
	/** Another element of this Pair. */
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
	 * Constructs a new Pair object containing two equal sets.
	 * (a convenience constructor)
	 * @see Singleton
	 * @param x an element of this set (equal to the other element)
	 */
	public Pair(Set x) {
		this(x,x);
	}
//	public Pair() {
//		this(new EmptySet()); // delete this constructor soon
//	}
	/**
     * {@inheritDoc}
	 * A pair contains exactly its elements.
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
//		boolean xIsempty = x.isEmpty();
//		boolean xOwnsAnElement = x.contains(this.element1) || x.contains(this.element2);
//		boolean xOwnsNoOtherElements = false; // what to do here?
//		return xIsempty || xOwnsAnElement || xOwnsNoOtherElements; // or ? what about sets that aren't pairs?
	}
	/**
	 * Returns whether this Pair contains both elements of the specified Pair.
	 * (a convenience method to speed computation)
	 * @see includes(Set)
	 * @param x the specified Pair
	 * @return true if this contains both elements of x
	 */
	public boolean includes(Pair x) {
		return this.contains(x.element1) && this.contains(x.element2);
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
//	@Override
//	public boolean isInductive() {
//		return false;
//	}
	/**
     * {@inheritDoc}
	 * @return {@code {element1, element2}}
	 */
	@Override
	public String toString() {
		String s = "{ " + this.element1;
		if (!this.element1.equals(this.element2)) {
			s += ",  " + this.element2;
		}
		s += " }";
		return s;
	}
}