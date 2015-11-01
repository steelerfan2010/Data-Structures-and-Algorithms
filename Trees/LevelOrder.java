import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {

    /* Print a binary tree by each level */

    public static void main(String[] args) {
        BSTNode root = new BSTNode(50);
        root.left = new BSTNode(25);
        root.right = new BSTNode(75);
        root.left.left = new BSTNode(10);
        root.right.left = new BSTNode(65);
        root.right.left.right = new BSTNode(100);

        levelOrder(root);
    }

    public static void levelOrder(BSTNode node) {
        Queue<BSTNode> bfs = new LinkedList<BSTNode>();
        bfs.add(node);
        int currLevel = 1;
        int nextLevel = 0;

        while(!bfs.isEmpty()) {
            BSTNode current = bfs.poll();
            System.out.println(current.value);
            currLevel--;
            if(current.left != null) {
                bfs.add(current.left);
                nextLevel++;
            }
            if(current.right != null) {
                bfs.add(current.right);
                nextLevel++;
            }
            if(currLevel == 0) {
                System.out.println("******************");
                currLevel = nextLevel;
                nextLevel = 0;
            }
        }
    }

}
