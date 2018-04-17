package L21;

import java.util.HashMap;

public class TrieNode {
	char data;
	boolean isTerminal;
	HashMap<Character, TrieNode> children;
	
	TrieNode(char data) {
		this.data = data;
		isTerminal = false;
		children = new HashMap<Character, TrieNode>();
	}
	
}
