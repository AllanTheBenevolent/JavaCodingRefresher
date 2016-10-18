package binarysearchtree;

/**
 *
 * @author Allan Wong
 */
public interface Tree<D extends Comparable> {
    public boolean isEmpty();
    public int cardinality(); // size of the tree
    public boolean member(D element); // what is in the tree
    public NonEmptyBST<D> add(D element);
}
