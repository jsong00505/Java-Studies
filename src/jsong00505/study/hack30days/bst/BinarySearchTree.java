package jsong00505.study.hack30days.bst;

public class BinarySearchTree {
	public static void main(String[] args) {
		Tree<Integer> bst = new EmptyBST();
		bst = bst.add(4);
		bst = bst.add(3);
		bst = bst.add(2);
		
		System.out.println("3 is in bst >> " + bst.member(3));
		System.out.println("5 is in bst >> " + bst.member(5));
		System.out.println("cardinality >> " + bst.cardinality());
		
	}
}
