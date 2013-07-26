package chh.math.logic;

/**
 *
 * @author  Christopher H. Harvey <chrisharvey2pi@gmail.com>
 * @version 2013.07.26
 */
public class Disjunction extends Proposition {
	/**
	 * Constructs a new Disjunction object.
	 * @param p
	 * @param q  
	 */
	public Disjunction(Proposition p, Proposition q) {
		super(p.value() || q.value());
	}
}
