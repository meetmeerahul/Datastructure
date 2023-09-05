import java.util.HashMap;
import java.util.Map;

public class testTrie {

    static class TrieNode {

        Map<Character, TrieNode> children = new HashMap<>();

    }

    TrieNode root = new TrieNode();
    char endSymbol = '*';

    public testTrie(String str) {

        populateSufuxTrie(str);
    }

    private void populateSufuxTrie(String str) {

        for (int i = 0; i < str.length(); i++) {

            insertSubString(i, str);
        }
    }

    private void insertSubString(int index, String str) {

        TrieNode node = root;

        for (int i = index; i < str.length(); i++) {

            char letter = str.charAt(i);

            if (!node.children.containsKey(letter)) {

                TrieNode newNode = new TrieNode();
                node.children.put(letter, newNode);
            }

            node = node.children.get(letter);
        }
      // node.children.put(endSymbol, null);
    }

    public boolean contains(String str) {

        TrieNode node = root;

        for (int i = 0; i < str.length(); i++) {

            char letter = str.charAt(i);

            if (!node.children.containsKey(letter)) {
                return false;
            }
            node = node.children.get(letter);
        }

        return true;
    }

    public static void main(String[] args) {

        testTrie trie = new testTrie("welcome");

        System.out.println(trie.contains("come"));
        System.out.println(trie.contains("mei"));
    }

}
