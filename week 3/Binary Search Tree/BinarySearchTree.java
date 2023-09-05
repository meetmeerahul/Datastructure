
class BinarySearchTree {

    class TreeNode {

        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    public TreeNode root;

    public void insert(int data) {

        root = insertNode(root, data);
    }

    public TreeNode insertNode(TreeNode root, int val) {

        if (root == null) {

            root = new TreeNode(val);
            return root;
        }

        if (val < root.data) {

            root.left = insertNode(root.left, val);
        } else {
            root.right = insertNode(root.right, val);
        }
        return root;
    }

    public TreeNode search(TreeNode root, int key) {

        if (root == null || root.data == key) {

            return root;

        }
        if (key < root.data) {

            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    public void inOrder(TreeNode root) {

        if (root == null) {
            return;

        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public boolean isValidBST(TreeNode root) {

        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);

    }


    public boolean isValid(TreeNode root, long min, long max) {

        if (root == null) {

            return true;

        }

        if (root.data <= min || root.data >= max) {

            return false;
        }

        boolean left = isValid(root.left, min, root.data);

        if (left) {

            boolean right = isValid(root.right, root.data, max);
            return right;

        }

        return false;

    }

    public static TreeNode deleteNode(TreeNode root, int key) {

        if (root == null) {
            return root;
        }

        if (key < root.data) {

            root.left = deleteNode(root.left, key);

        }
         else if (key > root.data) {

            root.right = deleteNode(root.right, key);

        }
         else {

            if (root.left == null) {

                return root.right;

            } else if (root.right == null) {

                return root.left;
            }

            root.data = inOrderSuccessor(root.right);
            root.right = deleteNode(root.right, key);

        }

        return root.right;

    }

    private static int inOrderSuccessor(TreeNode root) {

        int minimum = root.data;

        while (root.left != null) {

            minimum = root.left.data;
        }

        return minimum;

    }

    public TreeNode findCLossestElement(TreeNode root, int key) {

        if (root == null) {
            return null;
        }


        int minDiff = Integer.MAX_VALUE;
        TreeNode clossestElem = null;
        
        while (root != null) {

            int curDiff = Math.abs(root.data - key);

            if (curDiff < minDiff) {
                minDiff = curDiff;
                clossestElem = root;
            }

            if (key < root.data) {
                root = root.left;
            } else if (key > root.data) {
                root = root.right;
            } else {
                break;
            }

        }

        return clossestElem;

    }

    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();

        BinarySearchTree tree2 = new BinarySearchTree();

        tree2.insert(12);
        tree2.insert(9);
        tree2.insert(16);

        int[] data = { 5, 1, 4, 0, 0, 3, 6 };

        for (int i = 0; i < data.length; i++) {
            tree.insert(data[i]);
        }

        tree.inOrder(tree.root);
        System.out.println(tree.isValidBST(tree.root));
        System.out.println();
        tree2.inOrder(tree2.root);
        System.out.println(tree2.isValidBST(tree2.root));

        if (tree.search(tree.root, 6) != null) {

            System.out.println("\nKey Fount in the tree");
        } else {
            System.out.println("\nKey Not Found");
        }

        deleteNode(tree2.root, 9);
        // tree2.inOrder(tree2.root);

        int shortestKey = 15;
        TreeNode elemt = tree2.findCLossestElement(tree2.root, shortestKey);

        if (elemt != null) {
            System.out.println("clossest element to " + shortestKey + " is : " + elemt.data);
        }

    }

}