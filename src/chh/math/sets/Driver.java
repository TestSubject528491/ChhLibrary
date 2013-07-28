package chh.math.sets;

/**
 *
 * @author Christopher H. Harvey <chrisharvey2pi@gmail.com>
 */
public final class Driver {
    
    private Driver() { }
    
	private static String showset(Set x) {
		String s = x + " is empty? " + x.isEmpty();
		if (!x.isEmpty()) {
			Pair y = (Pair) x;
			s += "\n    " + showset(y.element1);
			if (!y.element1.equals(y.element2)) {
				s += "\n    " + showset(y.element2);
			} else {
//				s += "\n    " + y.element1 + " equals " + y.element2;
			}
		}
		return s;
	}
	private static String comparesets(Set x, Set y) {
		String s = "";
		s += showset(x) + "\n" + showset(y);
		s += "\nthe Set " + x + (x.includes(y) ? " includes " : " does not include ") + "the Set " + y;
		s += "\nthe Set " + y + (y.includes(x) ? " includes " : " does not include ") + "the Set " + x;
		s += "\ntherefore " + x + (x.equals(y) ? " equals " : " does not equal ") + y;
		return s;
	}
	private static String comparepairs(Pair x, Pair y) {
		String s = "";
		s += showset(x) + "\n" + showset(y);
		s += "\nthe Pair " + x + (x.includes(y) ? " includes " : " does not include ") + "the Pair " + y;
		s += "\nthe Pair " + y + (y.includes(x) ? " includes " : " does not include ") + "the Pair " + x;
		s += "\ntherefore" + x + (x.equals(y) ? " equals " : " does not equal ") + y;
		return s;
	}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EmptySet a = new EmptySet();
		EmptySet aPrime = new EmptySet();
		Pair b = new Pair(new EmptySet(), new EmptySet());
		Pair bPrime = new Pair(new EmptySet(), new EmptySet());
		
//		System.out.println(compare(a, aPrime));
//		System.out.println();
		System.out.println(comparesets(b, bPrime));
//		System.out.println(comparepairs(b, bPrime));
		
		
		
//		System.out.println(c.element1.equals(c.element2));
//		System.out.println(c.element1.equals(c.element2));
//		System.out.println(b);
//		System.out.println(b.element1);
//		System.out.println(b.element2);
//		System.out.println(b.element1.equals(b.element2));
		
		
		
//		System.out.println(c);
//		System.out.println(c.element1);
//		System.out.println(c.element2);
		
		
//		System.out.println(c.element1.equals(b));
//		y = new Pair(new EmptySet(), new EmptySet());
		
//		System.out.println(y.element1.equals(y.element2));
		
    }

}
