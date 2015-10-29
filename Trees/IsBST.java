public class IsBST {

	/* Check if Tree is BST */

	public static void main(String[] args) {
		BSTNode root = new BSTNode(100);
		root.left = new BSTNode(55);
		root.right = new BSTNode(250);
		root.left.left = new BSTNode(15);
		root.left.right = new BSTNode(75);
		root.left.left.left = new BSTNode(3);
//		root.left.left.left.left = new BSTNode(40); //can add in to make false

		System.out.println(isBst(root, -10000, 10000));
	}

	public static boolean isBst(BSTNode node, int min, int max) {
		if(node == null) {
			return true;
		}
	
		if(node.value > max) {
			return false;
		}
	
		if(node.value < min) {
			return false;
		}

		return isBst(node.left, min, node.value) && isBst(node.right, node.value, max);
	}

}
