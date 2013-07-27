package chh.math.sets;
/**
 * The Axiom of Union:
 * 
 * @author  Christopher H. Harvey <chrisharvey2pi@gmail.com>
 * @version 2013.07.26
 */
public class Union extends Set {
	/** */
	private final Set baseSet;
	/**
	 * Constructs a new Union object.
	 * @param x 
	 */
	public Union(Set x) {
		this.baseSet = x;
	}
	/**
	 *
	 * @param x
	 * @param y
	 */
	public Union(Set x, Set y) {
		this(new Pair(x, y));
	}
	/**
     * {@inheritDoc}
     */
	@Override
	public boolean contains(Set x) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	/**
     * {@inheritDoc}
     */
	@Override
	public boolean includes(Set x) {
		/*
		 * consider baseSet as the collection of sets A, B, C, and so on.
		 * then A, B, C, etc. are elements of baseSet. The Union of baseSet, by dfn, is
		 * the collection of all elements in A, B, C, etc. So A, B, C, etc.
		 * are all subsets of the Union (not baseSet).
		 * Therefore any element of baseSet is a subset of Union.
		 * However, these are not the only subsets...
		 */
		/*
		 * if t is an element of x then t is an element of either of 
		 * A, B, C, or any other element of baseSet
		 * this does NOT mean that x is a subset of either of A, B, C, etc,
		 * because t1 could be in A and t2 could be in B.
		 */		
		return x.isEmpty() || this.baseSet.contains(x);
	}
	/**
     * {@inheritDoc}
	 * The only time a Union is empty is if it is the union of a collection of 
	 * empty sets (meaning it's the union of a singleton of the empty set), or 
	 * if it is the Union of an empty set itself.
     */
	@Override
	public boolean isEmpty() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	/**
     * {@inheritDoc}
     */
	@Override
	public boolean isInductive() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
}
