public class BST {

	private BSTNode root;

	public BST() {
		root = null;
	}

	public void insert(int value) {
		root = insert(value, root);
	}

//decide if should be static (and take node param) or not
	public BSTNode insert(int value, BSTNode root) {
		if(this.root == null) {
			this.root = new BSTNode(value);	
		}
		else {
			if((root.left != null) && (root.left.value > value)) {
				root.left = insert(value, root.left);
			}
			if((root.right != null) && (root.right.value < value)) {
				root.right = insert(value, root.right);
			}
		}	
		return root;
	}

	public void inOrder(BSTNode node) {
		if(node == null) {
			return;
		}
		inOrder(node.left);
		System.out.println(node.value);
		inOrder(node.right);
	}

	public static void main(String[] args) {
		BST tree = new BST();
		tree.insert(
	}

}
