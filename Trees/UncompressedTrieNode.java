import java.util.ArrayList;

public class UncompressedTrieNode {

	char letter;
	ArrayList<UncompressedTrieNode> kids = null;

	public UncompressedTrieNode() {
        kids = new ArrayList<UncompressedTrieNode>();
	}

	public UncompressedTrieNode(char letter) {
		this.letter = letter;
        this.kids = new ArrayList<UncompressedTrieNode>();
	}

    public static void main(String[] args) {
        UncompressedTrieNode root = new UncompressedTrieNode('T');
        ArrayList<UncompressedTrieNode> children = new ArrayList<UncompressedTrieNode>();

        UncompressedTrieNode k1 = new UncompressedTrieNode('A');
        UncompressedTrieNode k2 = new UncompressedTrieNode('O');
        UncompressedTrieNode k3 = new UncompressedTrieNode('E');

        children.add(k1);
        children.add(k2);
        children.add(k3);

        root.kids = children;

        ArrayList<UncompressedTrieNode> children2 = new ArrayList<UncompressedTrieNode>();

        UncompressedTrieNode k11 = new UncompressedTrieNode('N');
        UncompressedTrieNode k12 = new UncompressedTrieNode('P');
       
        children2.add(k11);
        children2.add(k12);

        k1.kids = children2;

        printTrie(root);
        System.out.println("******************************");
        CompressedTrieNode compressRoot = compressTrie(root);
        printTrie(compressRoot);
    }

    public static CompressedTrieNode compressTrie(UncompressedTrieNode node) {
        CompressedTrieNode root = new CompressedTrieNode();

        if(node.kids.size() == 0) { //do nothing
            return null;
        }
        else if(node.kids.size() == 1) { //move up
            String str = String.valueOf(node.letter) + String.valueOf(node.kids.get(0).letter);
            root.letters = str;

        }
        else { //traverse through kids
            for(int i = 0; i < node.kids.size(); i++) {
                compressTrie(node.kids.get(i));
            }
        }
        return root;
    }


    public static void printTrie(UncompressedTrieNode node) {
        if(node == null) {
            return;
        }

        System.out.println("Letter: " + node.letter);

        for(int i = 0; i < node.kids.size(); i++) {
            printTrie(node.kids.get(i));
        }
    }

    public static void printTrie(CompressedTrieNode node) {
        if(node == null) {
            return;
        }

        System.out.println("Letter(s): " + node.letters);

        for(int i = 0; i < node.kids.size(); i++) {
            printTrie(node.kids.get(i));
        }
    }

}
