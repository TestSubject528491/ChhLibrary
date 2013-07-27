package chh.math.sets;
/**
 * The Axiom of Power:
 * 
 * @author  Christopher H. Harvey <chrisharvey2pi@gmail.com>
 * @version 2013.07.26
 */
public class Powerset extends Set {
	/** */
	private final Set baseElement;
	/**
	 * Constructs a new Powerset object.
	 * @param x 
	 */
	public Powerset(Set x) {
		this.baseElement = x;
	}
	
	/**
     * {@inheritDoc}
	 * If A is a set then the powerset P(A) will have as elements all subsets of A.
     */
    @Override
	public boolean contains(Set x) {
		return this.baseElement.includes(x);
	}
	/**
     * {@inheritDoc}
     */
	@Override
	public boolean includes(Set x) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	/**
     * {@inheritDoc}
	 * The powerset of any set is nonempty.
     */
	@Override
	public boolean isEmpty() {
		return false;
	}
	/**
     * {@inheritDoc}
     */
	@Override
	public boolean isInductive() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
}
