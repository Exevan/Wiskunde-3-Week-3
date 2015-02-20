package binarySearchTree;

public class BinarySearchTreeFactory {
	
	public static BinarySearchTree createBST(){
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(4);
		tree.insert(2);
		tree.insert(6);
		tree.insert(1);
		tree.insert(3);
		tree.insert(5);
		tree.insert(7);
		return tree;
	}

}
