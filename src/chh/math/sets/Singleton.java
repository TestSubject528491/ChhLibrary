package chh.math.sets;
/**
 * Singleton Theorem:
 * For every set x, there exists a set that contains exactly x. {@code new Singleton(x)} is defined as {@code super(x,x)}.
 * @author  <a href="mailto:chrisharvey2pi@gmail.com">Christopher H. Harvey</a>
 * @version 2013.07.26
 */
public class Singleton extends Pair {
	/**
	 * Constructs a new Singleton object containing a specified set.
	 * @param x the only element of this set
	 */
	public Singleton(Set x) {
		super(x,x);
	}
}