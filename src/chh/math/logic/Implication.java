package chh.math.logic;

/**
 *
 * @author  Christopher H. Harvey <chrisharvey2pi@gmail.com>
 * @version 2013.07.26
 */
public class Implication extends Disjunction {
	/**
	 * Constructs a new Implication object.
	 * @param p
	 * @param q  
	 */
	public Implication(Proposition p, Proposition q) {
		super(new Negation(p), q);
	}
}
