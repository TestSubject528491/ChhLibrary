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
	public final Set element1;
	/** Another element of this set. */
	public final Set element2;
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
	 * Constructs a new Pair object containing one set.
	 * @param x the only element of this set
	 */
	private Pair(Set x) {
		super();
		this.element1 = x;
		this.element2 = x;
	}
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
		boolean xIsempty = x.isEmpty();
		return xIsempty; // or ? what about sets that aren't pairs?
	}
	/**
	 * Returns whether this Pair contains both elements of the specified Pair.
	 * @see includes(Set)
	 * @param x the specified Pair
	 * @return true if this contains both elements of x
	 */
//	public boolean includes(Pair x) {
//		return this.contains(x.element1) && this.contains(x.element2);
//	}
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