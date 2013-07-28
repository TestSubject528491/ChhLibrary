package chh.math.sets;

/**
 * For all sets a and b, define {@code OrderedTriple(a,b,c)} as {@code new OrderedPair(new OrderedPair(a), new OrderedPair(b,c))}.
 * @author  Christopher H. Harvey <chrisharvey2pi@gmail.com>
 * @version 2013.07.27
 */
public class OrderedTriple extends OrderedPair {
	/**
	 * Constructs a new OrderedTriple object.
	 * 
	 * @param a
	 * @param b 
	 * @param c  
	 */
	public OrderedTriple(Set a, Set b, Set c) {	
		super(a, new OrderedPair(b,c));
	}
	public OrderedTriple() {
		this(new EmptySet(), new EmptySet(), new EmptySet());
	}
}
