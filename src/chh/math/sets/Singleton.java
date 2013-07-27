package chh.math.sets;
/**
 * Singleton Theorem:
 * For every set x, there exists a set that contains exactly x.
 * <br />Proof: by the Axiom of Pair, there exists a set {@code y = new Pair(x,x)} and {@code y.contains(x)==true}.
 * But if {@code z = new Set()} and {@code z.equals(x)==false}, then {@code y.contains(z)==false}.
 * @author  Christopher H. Harvey <chrisharvey2pi@gmail.com>
 * @version 2013.07.26
 */
public class Singleton extends Pair {
	/**
	 * Constructs a new Singleton object containing a specified set.
	 * @param x an (the only) element of this set
	 */
	public Singleton(Set x) {
		super(x);
	}
	/**
	 * Constructs a new Singleton object containing an {@see EmptySet}.
	 */
	public Singleton() {
		super();
	}
}
