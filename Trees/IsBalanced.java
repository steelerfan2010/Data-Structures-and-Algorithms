public class IsBalanced {

	public static void main(String[] args) {
		BSTNode root = new BSTNode(100);
		root.left = new BSTNode(50);
		root.right = new BSTNode(250);
		root.right.left = new BSTNode(125);
		root.right.right = new BSTNode(400);

		System.out.println(getHeight(root, 125, 0));
		System.out.println(getHeight(root, 50, 0));
		System.out.println(getHeight(root, 100, 0));
		System.out.println(getHeight(root, 1252, 0));
		System.out.println(getHeight(root, 400, 0));
	}

	public static boolean isBalanced(BSTNode node) {
		return true;
	}

	public static int getHeight(BSTNode node, int number, int height) {
		if(node == null) {
			return -1; //not in tree
		}	

		if(node.value == number) {
			return height;
		}

		if(number >  node.value) {
			return getHeight(node.right, number, ++height);
		}
		else {
			return getHeight(node.left, number, ++height);
		}
	}

}
