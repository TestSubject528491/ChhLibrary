package chh.elmnts;

/**
 * An unordered finite collection of other Sets.
 * In mathematics, a set is an object that "owns" other sets. A set is <i>immutable</i>, so it cannot be changed once instantiated.
 * @author Christopher H. Harvey <chrisharvey2pi@gmail.com>
 * @version 2010.12.07
 */
public class Set {
    /**
     * An array that holds this object's elements.
     * Even though arrays are ordered, the order of items in this array is irrelevant
     * because sets are unordered.
     */
    private final Set[] elements; // final because it is immutable    

    
    /**
     * Constructs a new Set with given elements.
     * @param elems    an array of Set objects
     */
    public Set(Set[] elems) {
        this.elements = Set.removeDuplicates(elems);
    }
    /**
     * Constructs a copy of the given Set (A "copy constructor").
     * @param s the Set object to be copied.
     */
    public Set(Set s) {
        this(s.toArray());
    }
    /**
     * Constructs an empty set.
     */
    public Set() {
        this(new Set[0]);
    }
    
    /**
     * Removes duplicates from an array of Set objects.
     * And returns a new array with {@code null} objects replaced for the duplicates.
     * @param oldArray 
     * @return a new array with duplicates removed and replaced with {@code null} objects
     */
    private static Set[] removeDuplicates(Set[] oldArray) {
        int cells = 0; // the number of needed cells in the new array
        for (int i = 0; i < oldArray.length; i++) {
            /* Loops through old array and nullifies all non-null Set objects that are equal to the current Set object. */
            if (oldArray[i] != null) {
                cells++;
                for (int j = i + 1; j < oldArray.length; j++) {
                    if (oldArray[i].equals(oldArray[j])) oldArray[j] = null;
                }
            }
        }
        Set[] newArray = new Set[cells]; // the new array without any duplicates or empty spaces
        int nCell = 0; // an index for the new array
        for (int i = 0; i < oldArray.length; i++) {
            /* loops through old array and copies entries to new array only if they are non-null */
            if (oldArray[i] != null) {
                newArray[nCell] = oldArray[i];
                nCell++;        
            }
        }
        return newArray;
    }
    
    /**
     * Returns a list of elements in this set. This list is an array of other sets.
     * @return 
     */
    public final Set[] toArray() {
        return this.elements;
    }
    /**
     * Returns a Cardinal number representing this set's size.
     * @return  a {@code Cardinal} object that corresponds to this set's size.
     */
    public final Cardinal cardinality() {
        return new Cardinal(this.elements.length);
    }
    /**
     * Verifies whether this set is 'empty'. Mathematical empty sets own no elements.
     * @return  {@code true} if the set has zero elements.
     */
    public final boolean isEmpty() {
        return (this != null && this.cardinality().getValue() == 0);
    }
    /**
     * Returns the equinumerosity of this set compared to the given set.
     * Mathematical sets are equinumerous if and only if their cardinalities are equal.
     * (Technically, mathematical sets are equinumerous defined by there exists a bijection between them,
     *  but this is equivalent to saying their cardinalities are equal.)
     * @param set 
     * @return  {@code true} if the sets are equinumerous.
     */
    public final boolean isEquinumerousTo(Set set) {
        return this.cardinality().equals(set.cardinality());
    }
    
    /**
     * Determines whether this set 'owns' a particular element.
     * Mathematical ownership indicates that the element is a member of this set.
     * @param elem  the element in question
     * @return      {@code true} if {@code elem} is a member of this set
     */
    public final boolean owns(Set elem) {
        /* Assume false, and if just one element in this set is equal to the given, set true. */
        boolean predicate = false; 
        for (int i = 0; i < this.elements.length; i++) {
            predicate = predicate || this.elements[i].equals(elem);
        }
        return predicate;
    }
    /**
     * Determines whether this set is a member of a particular set.
     * An inverse method for the {@code owns(Set)} method.
     * @param set   the set in question
     * @return      {@code true} if {@code set} owns this set
     */
    public final boolean isElementOf(Set set) {
        return set.owns(this);
    }
    /**
     * Determines whether this set is a superset of a particular set.
     * 'B' is a superset of 'A' if and only if 'B' owns at least all the elements in 'A'.
     * @param set   the set in question
     * @return      {@code true} if this set owns at least all the elements in {@code set}
     */
    public final boolean isSupersetOf(Set set) {
        /* Assume true, and if just one element in {@code set} is not in this, set false. */
        boolean predicate = true;
        for (int i = 0; i < set.elements.length; i++) {
            predicate = predicate && this.owns(set.elements[i]);
        }
        return predicate;
    }
    /**
     * Determines whether this is a subset of a particular set.
     * An inverse method for the {@code isSupersetOf(Set)} method.
     * @param set 
     * @return  {@code true} if {@code set} is a superset of this set
     */
    public final boolean isSubsetOf(Set set) {
        return set.isSupersetOf(this);
    }
    
    /**
     * Returns whether this set is 'equal' to the given set.
     * Set equality is defined by the Axiom of Extensionality:
     *  Two sets are equal if and only if they own exactly the same elements,
     *  (ignoring the fact that "the same" means "equal":
     *      this method is recursive in that it tests the elements the same way as it does sets).
     *  In other words, they are supersets of each other (equivalently, they are subsets of each other).
     * @param set 
     * @return {@code true} if these sets have exactly the same elements
     */
    public boolean equals(Set set) {
        boolean predicate;
        if (this == null || set == null || !(this.isEquinumerousTo(set))) {
            // if either set is null (not the same as mathematically "null")
            // or if the sets are not equinumerous
            predicate = false;
        } else if (this.isEmpty() && set.isEmpty()) {
            // if both sets are empty //BASIS for the recursive nature of equals(Set) and owns(Set)
            predicate = true;
        } else {
            predicate = this.isSupersetOf(set) && this.isSubsetOf(set);
        }
        return predicate;
    }
            
}