package jsong00505.study.hack30days.bst;

public class NonEmptyBST<D extends Comparable> implements Tree<D> {
	// we don't know whether left, right are EmptyBST or NonEmptyBST 
	Tree<D> left;
	Tree<D> right;
	D element;
	
	public NonEmptyBST(D elt) {
		left = new EmptyBST<D>();
		right = new EmptyBST<D>();
		element = elt;
	}
	
	public NonEmptyBST(D elt, Tree<D> leftTree, Tree<D> rightTree) {
		element = elt;
		left = leftTree;
		right = rightTree;
	}
	
	public boolean isEmpty() {
		return false;
	}
	
	public int cardinality() {
		return 1 + left.cardinality() + right.cardinality();
	}
	
	public boolean member(D elt) {
		if(element == elt) {
			return true;
		} else {
			if(elt.compareTo(element) < 0) {
				return left.member(elt);
			} else {
				return right.member(elt);
			}
		}
	}
	
	public NonEmptyBST<D> add(D elt) {
		if(element == elt) {
			return this;
		} else {
			if(elt.compareTo(element) < 0) {
				return new NonEmptyBST(element, left.add(elt), right);
			} else {
				return new NonEmptyBST(element, left, right.add(elt));
			}
		}
		
	}
}
