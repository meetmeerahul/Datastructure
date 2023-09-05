

import java.util.HashMap;
import java.util.Map;

public class Trie4 {
	static class TrieNode{
		Map<Character,TrieNode> children = new HashMap<>();
	}
	TrieNode root = new TrieNode();
	char endSymbol = '*';//word ending with the symbol
	
	public Trie4(String str) {
		populateSuffixTrie(str);
	}
	
	public void populateSuffixTrie(String str) {
		for(int i=0;i<str.length();i++) {
			insertSubstringStartingAt(i, str);
		}
	}
	
	
	public void insertSubstringStartingAt(int index,String str) {
		TrieNode node = root;
		for(int i=index;i<str.length();i++) {
			char letter = str.charAt(i);
			if(!node.children.containsKey(letter)) {
				TrieNode newNode = new TrieNode();
				node.children.put(letter, newNode);
			}
			node = node.children.get(letter);
		}
		node.children.put(endSymbol, null);
	}
	
	public boolean contains(String str) {//checking suffix inside the trie
		TrieNode node = root;
		for(int i=0;i<str.length();i++) {
			char letter = str.charAt(i);
			if(!node.children.containsKey(letter)) {
				return false;
			}
			node = node.children.get(letter);
		}
		return node.children.containsKey(endSymbol);
	}
	
	public static void main(String[] args) {
		Trie4 trie = new Trie4("welcome");
		System.out.println("this suffix inside the trie : "+trie.contains("come"));
		System.out.println("this suffix inside the trie : "+trie.contains("com"));
	}

}