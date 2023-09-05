public class BinaryTree {
    
    Node root;
 
    /* This function checks if the binary tree is complete or not */
    public boolean isComplete(Node root) {

        // An empty tree is complete

        if (root == null)
            return true;
 
        // Check if left and right subtrees are complete

        if (root.left == null && root.right == null)
            return true;

        if ((root.left != null && root.right == null) || (root.left == null && root.right != null))
            return false;
 
        // Recursively check if the left and right subtrees are complete
        return (isComplete(root.left) && isComplete(root.right));
    }
 
    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(6);
        if (tree.isComplete(tree.root))
            System.out.println("The binary tree is complete");
        else
            System.out.println("The binary tree is not complete");
    }
}
 
class Node {
    int data;
    Node left, right;
 
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
