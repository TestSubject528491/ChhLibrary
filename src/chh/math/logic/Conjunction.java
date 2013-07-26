package chh.math.logic;

/**
 *
 * @author  Christopher H. Harvey <chrisharvey2pi@gmail.com>
 * @version 2013.07.26
 */
public class Conjunction extends Negation {
	/**
	 * Constructs a new Conjunction object.
	 * @param p
	 * @param q  
	 */
	public Conjunction(Proposition p, Proposition q) {
		super(new Disjunction(new Negation(p), new Negation(q)));
	}
}
