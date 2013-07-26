package chh.math.sets;
/**
 *
 * @author  Christopher H. Harvey <chrisharvey2pi@gmail.com>
 * @version 2013.07.26
 */
public class Pair extends Set {
	/** one element of this set */
	private final Set element1;
	/** another element of this set */
	private final Set element2;
	/**
     * Constructs a new Pair object.
	 * The Axiom of Pair says that given two sets, x and y, there exists a set that contains exactly them both.
	 * The order of parameters is irrelevant.
	 * @param x one element of this set
	 * @param y another element of this set
	 */
    public Pair(Set x, Set y) {
		this.element1 = x;
		this.element2 = y;
	}
	/**
	 * Constructs a new Pair object, as a singleton.
	 * @param x the element of this set
	 */
	public Pair(Set x) {
		this(x, x);
	}
	/**
     * {@inheritDoc}
	 * A 
     */
    @Override
	public boolean contains(Set x) {
		boolean p = this.element1.equals(x);
		boolean q = this.element2.equals(x);
		return p || q;
	}
	/**
     * {@inheritDoc}
     */
	@Override
	protected boolean includes(Set x) {
		boolean p = x.isEmpty();
		boolean q = x.equals(new Singleton(this.element1));
		boolean r = x.equals(new Singleton(this.element2));
		boolean s = x.equals(this);
		return p || q || r || s;
	}
	/**
     * {@inheritDoc}
	 * A Pair is always nonempty.
     */
	@Override
	public boolean isEmpty() {
		return false;
	}	
}