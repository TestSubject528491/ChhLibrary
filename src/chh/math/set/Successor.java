package chh.math.set;
/**
 *
 * @author  Christopher H. Harvey <chrisharvey2pi@gmail.com>
 * @version 2013.07.29
 */
public class Successor extends Union {
	/**
	 * Constructs a new Successor object.
	 * 
	 * @param x 
	 */
	public Successor(Set x) {
		super(x, new Singleton(x));
	}
}
