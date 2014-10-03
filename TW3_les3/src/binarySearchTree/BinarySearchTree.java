package binarySearchTree;


public class BinarySearchTree{

	private class BinaryNode {
		public int data;
		public BinaryNode left, right;

		public BinaryNode(int data){
			this(data, null, null);
		}

		public BinaryNode(int data, BinaryNode leftChild, BinaryNode rightChild) {
			this.data = data;
			this.left = leftChild;
			this.right = rightChild;
		}	
	}	

	private BinaryNode groot;

	public BinarySearchTree(){
	}

	public BinaryNode getRoot() {
		return groot;
	}

	public boolean lookup(int target){
		return lookup(groot, target);
	}

	private boolean lookup(BinaryNode node, int target){
		if(node == null){
			return false;
		}		
		if(target == node.data){
			return true;
		} else if(target < node.data){
			return lookup(node.left, target);
		} else {	// target > node.getData()
			return lookup(node.right, target);
		}
	}

	public void insert(int data){
		if(groot == null)
			groot = new BinaryNode(data);
		insert(data, groot);
	}

	public void insert(int data, BinaryNode node) {
		if(data < node.data) {
			if(node.left == null)
				node.left = new BinaryNode(data);
			else
				insert(data, node.left);
		} else if(data > node.data) {
			if(node.right == null)
				node.right = new BinaryNode(data);
			else
				insert(data, node.right);
		}
	}

	public void mystery (){
		if ( groot != null ){
			if ( groot.left == null && groot.right == null ){
				groot = null ;
			} else {
				mystery ( null , groot );
			}
		}
	}

	private void mystery ( BinaryNode prev , BinaryNode node ){
		if ( node.left == null && node.right == null ){
			if ( prev.left == node ){
				prev.left = null ;
			} else {
				prev.right = null ;
			}
			return ;
		}
		if ( node.left != null ){
			mystery ( node , node.left );
		} else {
			mystery ( node , node.right );
		}
	}
}