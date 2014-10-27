package chh.elmnts;

/**
 * A natural number is an element of every inductive set.
 * More concretely, a natural number is a non-negative integer, otherwise known as a "counting number."
 * @author Christopher H. Harvey <chrisharvey2pi@gmail.com>
 * @version 2011.06.14
 */
public class Natural extends Set {
    /** The value (and set size) of this object. */
    private final int value;
    
    /**
     * Constructs a new Natural object corresponding to the given integer.
     * @param n a non-negative integer used to identify this object.
     */
    public Natural(int n) {
        /*
         * algorithm:
         * if (n == 0) super();                                                // empty set = 0
         * if (n == 1) return new Successor(super());                                 //=1
         * if (n == 2) return new Successor(new Natural(1));                  //=2
         * if (n == 3) return new Successor(new Natural(2));   //=3
         * for any n, return new Successor(new Natural(n-1));
         */
        //Successor(new Natural(n-1));
        this.value = java.lang.Math.abs(n);
    }
    /**
     * Constructs the Natural number zero, an empty set.
     */
    public Natural() {
        this(0);
    }
    
    /**
     * Returns the value associated with this object.
     * @return  an int describing the value of this object.
     */
    public final int getValue() {
        return this.value;
    }
    /**
     * Adds a natural number to this one and returns the sum.
     * @param n The natural number to be added
     * @return  The sum of this and {@code n}
     */
    public Natural add(Natural n) {
        return new Natural(this.value + n.value);
    }
    /**
     * Multiplies a natural number with this one and returns the product.
     * @param n The natural number to be multiplied
     * @return  The product of this and {@code n}
     */
    public Natural multiply(Natural n) {
        return new Natural(this.value * n.value);
    }
}

/**
 * A successor is a special operation on sets that constructs the union of a given set and its singleton.
 * The elements of a successor of a given set comprise of all the elements of that set in addition to that set itself.
 * @author Christopher H. Harvey <chrisharvey2pi@gmail.com>
 * @version 2011.06.15
 */
class Successor extends Union {
    /**
     * Constructs a new Successor object from a given set.
     * @param s the given set whose successor to construct
     */
    public Successor(Set s) {
        super(s, new Singleton(s));
    }
    /**
     * Constructs a new Successor object from an empty set.
     */
    public Successor() {
        this(new Set());
    }
    /**
     * A singleton is a set that owns exactly one element.
     * This class is not to be confused with a "singleton" class,
     *  which is a class that can only be instantiated once.
     * @author Christopher H. Harvey <chrisharvey2pi@gmail.com>
     * @version 2011.06.15
     */
    static class Singleton extends Set {
        /** The cardinality of all singletons. */
        //private static final int CARDINALITY = 1;
        
        /**
         * Constructs a new singleton from a given element.
         * @param s 
         */
        public Singleton(Set e) {
            super(new Set[] {e});
        }
    }
}