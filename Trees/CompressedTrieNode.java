public class CompressedTrieNode {

	String letters;
	CompressedTrieNode[] kids;

	public CompressedTrieNode() {
		kids = new CompressedTrieNode[26];
	}

	public CompressedTrieNode(String letters) {
		this.letters = letters;
	}

}
