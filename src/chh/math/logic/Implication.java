package chh.math.logic;

/**
 * The Implication is a binary operator on two propositions.
 * @author  Christopher H. Harvey <chrisharvey2pi@gmail.com>
 * @version 2013.07.26
 */
public class Implication extends Disjunction {
	/**
	 * Constructs a new Implication object.
	 * @param p the first proposition
	 * @param q  the second proposition
	 */
	public Implication(Proposition p, Proposition q) {
		super(new Negation(p), q);
	}
}
