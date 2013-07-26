package chh.math.logic;

/**
 *
 * @author  Christopher H. Harvey <chrisharvey2pi@gmail.com>
 * @version 2013.07.26
 */
public class Negation extends Proposition {
	/**
	 * Constructs a new Negation object.
	 * @param p 
	 */
	public Negation(Proposition p) {
		super(!p.value());
	}
	/**
	 *
	 */
	public Negation() {
		this(new Proposition()); // a convenience method
	}
}
