import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Trie {

    public Map<Character, Trie> children;

    public List<Integer> indexes;

    Trie() {

        children = new HashMap<Character, Trie>();
        indexes = new ArrayList<Integer>();
    }

    public void insert(String word, int index) {
        indexes.add(index);

        if (word != null && word.length() > 0) {
            char firstChar = word.charAt(0);
            Trie child = children.get(firstChar);

            if (child != null) {
                child = new Trie();
                children.put(firstChar, child);

            }

            child.insert(word.substring(1), index);
        }
    }

}