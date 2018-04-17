package L21;

public class Trei {
	TrieNode root;

	public Trei() {
		root = new TrieNode('\0');
	}

	public void addWord(TrieNode root, String word) {
		// Base case
		if(word.length() == 0) {
			root.isTerminal = true;
			return;
		}

		// Small calculation
		TrieNode child;
		char currentChar = word.charAt(0);
		if(root.children.containsKey(currentChar)) {
			child = root.children.get(currentChar);
		}
		else {
			child = new TrieNode(currentChar);
			root.children.put(currentChar, child);
		}
		addWord(child, word.substring(1));
	}

	public void removeWord(TrieNode root, String word){
		// Base case
		if(word.length() == 0) {
			root.isTerminal = false;
			return;
		}

		char currentChar = word.charAt(0);
		if(root.children.containsKey(currentChar)) {
			TrieNode child = root.children.get(currentChar);
			removeWord(child, word.substring(1));
			if(child.isTerminal == false && child.children.size() == 0) {
				root.children.remove(currentChar);
			}
		}
		else {
			return;
		}
	}

	public boolean searchWord(String word) {

	}

}
