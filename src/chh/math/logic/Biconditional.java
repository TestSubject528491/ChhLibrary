package chh.math.logic;

/**
 *
 * @author  Christopher H. Harvey <chrisharvey2pi@gmail.com>
 * @version 2013.07.26
 */
public class Biconditional extends Conjunction {
	/**
	 * Constructs a new Biconditional object.
	 * @param p
	 * @param q  
	 */
	public Biconditional(Proposition p, Proposition q) {
		super(new Implication(p, q), new Implication(q, p));
	}
}
