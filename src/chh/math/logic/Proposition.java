package chh.math.logic;

/**
 *
 * @author  Christopher H. Harvey <chrisharvey2pi@gmail.com>
 * @version 2013.07.26
 */
public class Proposition {
	/** */
	private final boolean value;
	/** */
	public static final boolean TAUTOLOGY = true;
	/** */
	public static final boolean CONTRADICTION = false;
	/**
     * Constructs a new Proposition object.
	 * @param b 
	 */
	Proposition(boolean b) {
		this.value = b;
	}
	/**
	 *
	 * @param p
	 */
	public Proposition(Proposition p) {
		this(p.value);
	}
	/**
	 *
	 */
	public Proposition() {
		this(true); // a convenience method
	}
	/**
	 *
	 * @return
	 */
	boolean value() {return this.value;}
}
