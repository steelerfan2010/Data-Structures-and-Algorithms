public class CommonAncestor {

    public static void main(String[] args) {
        BSTNode root = new BSTNode(50);
        root.left = new BSTNode(25);
        root.right = new BSTNode(75);
        root.left.left = new BSTNode(5);
        root.right.right = new BSTNode(100);
        root.right.right.right = new BSTNode(130);

        System.out.println(getCommonNode(root, 130, 100));
   }

    public static int getCommonNode(BSTNode node, int val1, int val2) {
        if(node.value == val1) {
            return node.value;
        }

        if(node.value == val2) {
            return node.value;
        }

        boolean sameSide1 = contains(node.left, val1);
        boolean sameSide2 = contains(node.left, val2);

        if(sameSide1 == sameSide2) {
            if(sameSide1) {
                return getCommonNode(node.left, val1, val2);
            }  
            else {
                return getCommonNode(node.right, val1, val2);
            }
        } 
        else {
            return node.value;
        }
    }

    public static boolean contains(BSTNode node, int val) {
        if(node == null) {
            return false;
        }

        if(node.value == val) {
            return true;
        }

        return (contains(node.left, val) || contains(node.right, val));
    }

}
