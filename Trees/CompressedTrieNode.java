import java.util.ArrayList;

public class CompressedTrieNode {

	String letters;
    ArrayList<CompressedTrieNode> kids = null;

	public CompressedTrieNode() {
        this.kids = new ArrayList<CompressedTrieNode>();
	}

	public CompressedTrieNode(String letters) {
		this.letters = letters;
        this.kids = new ArrayList<CompressedTrieNode>();
	}

}
