public class UncompressedTrieNode {

	char letter;
	UncompressedTrieNode[] kids;

	public UncompressedTrieNode() {
		kids = new UncompressedTrieNode[26];
	}

	public UncompressedTrieNode(char letter) {
		this();
		this.letter = letter;
	}

}
