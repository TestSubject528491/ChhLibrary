package chh.math.sets;

/**
 * An ordered triple is...
 * {@code OrderedTripleAlternate(a,b,c)} is defined as {@code new OrderedPairAlternate(new OrderedPairAlternate(a,b), new OrderedPairAlternate(c))}.
 * @author  <a href="mailto:chrisharvey2pi@gmail.com">Christopher H. Harvey</a>
 * @version 2013.07.27
 */
public class OrderedTripleAlternate extends OrderedPairAlternate {
	/**
	 * Constructs a new OrderedTripleAlternate object.
	 * 
	 * @param a
	 * @param b 
	 * @param c  
	 */
	public OrderedTripleAlternate(Set a, Set b, Set c) {	
//		super(a, new OrderedPairAlternate(b,c));
	}
	public OrderedTripleAlternate() {
//		this(new EmptySet(), new EmptySet(), new EmptySet());
	}
}
