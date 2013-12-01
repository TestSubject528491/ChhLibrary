package chh.math.set;
/**
 * Axiom of Possession:
 * For every set x, there exists a set that contains x. If it contains no other elements, this set is the singleton of x.
 * @author  <a href="mailto:chrisharvey2pi@gmail.com">Christopher H. Harvey</a>
 * @version 2013.07.26
 * 
 * 
 */
public class Singleton extends Set {
	/** The element of this singleton. */
	private final Set element;
	
	/**
	 * Constructs a new Singleton object containing a specified set.
	 * @param x the only element of this set
	 */
	public Singleton(Set x) {
		this.element = x;
	}
	
	/**
     * {@inheritDoc}
	 * A singleton contains exactly its element.
     */
	@Override
	public boolean contains(Set x) {
		return this.element.equals(x);
	}
	
	/**
     * {@inheritDoc}
     */
	@Override
	public boolean includes(Set x) {
		return x.isEmpty() || this.equals(x);
	}
	
	/**
     * {@inheritDoc}
	 * A Singleton is always nonempty.
	 * @return false
     */
	@Override
	public boolean isEmpty() {
		return false;
	}
	
	/**
     * {@inheritDoc}
	 * No Singleton objects are inductive.
	 * @return false
	 */
	@Override
	public boolean isInductive() {
		return false;
	}
	
	/**
     * {@inheritDoc}
	 * @return {@code {element1, element2}}
	 */
	@Override
	public String toString() {
		return "{ " + this.element + " }";
	}
}