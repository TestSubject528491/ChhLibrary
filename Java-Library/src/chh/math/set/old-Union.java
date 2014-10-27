package chh.elmnts;

/**
 * The union of a cluster of sets (a set whose members are sets that have relevant elements)
 * owns the all elements of all of the sets in that cluster.
 * @author Christopher H. Harvey <chrisharvey2pi@gmail.com>
 * @version 2011.06.14
 */
public class Union extends Set {
    /**
     * Constructs a new Union object from one collection of sets. (The collection is itself a set).
     * @param cluster   the collection of sets to create the union from
     */
    public Union(Set cluster) {
        super(union(cluster));
    }
    /**
     * Constructs a new Union object from two distinct sets.
     * @param s the first set
     * @param t the second set
     */
    public Union(Set s, Set t) {
        this(new Set(new Set[] {s,t}));
    }
    
    /**
     * Transfers entries from a two-dimensional array into a one-dimensional array, one by one.
     * @param cluster   the outer set with members that are other sets whose members are to be copied
     * @return          a one-dimensional array
     */
    private static final Set[] union(Set cluster) {
        /* Adds the cardinalities of each set in the collection */
        int cells = 0;
        //for (Set element : cluster) {} // can't do a for-each loop unless it is a 'Collection'
        for (int i = 0; i < cluster.cardinality().getValue(); i++) {
            cells += cluster.toArray()[i].cardinality().getValue();
        }
        Set[] union = new Set[cells]; // creates the new blank array with the correct number of cells
        
        /* copies the elements from the collection's sets into the new array */
        int nCell = 0; // an index for the new array
        for (int i = 0; i < cluster.cardinality().getValue(); i++) {
            for (int j = 0; j < cluster.toArray()[i].cardinality().getValue(); j++) {
                union[nCell] = cluster.toArray()[i].toArray()[j];
                nCell++;
            }
        }
        return union;
    }
}
