package binarySearchTree;

public class BinarySearchTreeDriver {

	public static void main(String[] args) {
		BinarySearchTree tree = BinarySearchTreeFactory.createBST();
		System.out.println("");
		while(tree.getRoot() != null) {	
			tree.deleteLeft();
			System.out.println("");
		}
	}

}
