public class IsBalanced {

    /* Determine if a binary tree is balanced */

	public static void main(String[] args) {
		BSTNode root = new BSTNode(100);
		root.left = new BSTNode(50);
		root.right = new BSTNode(250);
		root.right.left = new BSTNode(125);
		root.right.right = new BSTNode(400);
//        root.right.right.right = new BSTNode(30);

		System.out.println(getHeight(root, 125, 0));
		System.out.println(getHeight(root, 50, 0));
		System.out.println(getHeight(root, 100, 0));
		System.out.println(getHeight(root, 1252, 0));
		System.out.println(getHeight(root, 400, 0));

        System.out.println("*****");
        System.out.println(getHeight2(root));
        System.out.println("****");
        System.out.println(isBalanced(root));
	}

	public static boolean isBalanced(BSTNode node) {
        if(node == null) {
            return true;
        }
        int leftHeight = getHeight2(node.left);
        int rightHeight = getHeight2(node.right);

        if(Math.abs(leftHeight - rightHeight) > 1 ){
            return false;
        }
        return (isBalanced(node.left) && isBalanced(node.right));
	}

    //unrelated, but gets the height of a value in the tree
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

    public static int getHeight2(BSTNode node) {
        if(node == null) {
            return 0;
        }

        return (Math.max(getHeight2(node.left),getHeight2(node.right)) + 1);
    }

}
