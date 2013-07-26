package chh.math.sets;
/**
 *
 * @author  Christopher H. Harvey <chrisharvey2pi@gmail.com>
 * @version 2013.07.26
 */
public class Singleton extends Pair {
	/**
	 * Constructs a new Singleton object.
	 * @param x 
	 */
	public Singleton(Set x) {
		super(x, x);
	}	
}
