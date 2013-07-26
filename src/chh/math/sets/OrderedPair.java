package chh.math.sets;
import chh.math.logic.*;

/**
 *
 * @author  Christopher H. Harvey <chrisharvey2pi@gmail.com>
 * @version 2013.07.26
 */
public class OrderedPair extends Pair {
	/** */
	private final Set abscissa;
	/** */
	private final Set ordinate;
	
	/**
	 * Constructs a new OrderedPair object.
	 * @param abscissa
	 * @param ordinate  
	 */
	public OrderedPair(Set abscissa, Set ordinate) {
		super(new Singleton(abscissa), new Pair(abscissa,ordinate));
		this.abscissa = abscissa;
		this.ordinate = ordinate;
	}
	
	/**
     * 
	 * @param x
	 * @return  
	 */
	public Proposition equals(OrderedPair x) {
		Proposition p = new Proposition(this.abscissa.equals(x.abscissa));
		Proposition q = new Proposition(this.ordinate.equals(x.ordinate));
		return new Disjunction(new Conjunction(p, q), super.equals(x));
	}
}
