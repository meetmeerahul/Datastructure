class BST {

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

    public TreeNode insertNode(TreeNode root, int data) {

        if (root == null) {

            root = new TreeNode(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertNode(root.left, data);
        }
        if (data > root.data) {
            root.right = insertNode(root.right, data);
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

    public void preOrder(TreeNode root) {

        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(TreeNode root) {

        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public void postOrder(TreeNode root) {

        if (root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public boolean isValidBST(TreeNode root) {

        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValid(TreeNode root, long min, long max) {

        if (root == null) {

            return true;

        }

        if (min > root.data || max < root.data) {

            return false;
        }

        boolean left = isValid(root.left, min, root.data);

        if (left) {
            boolean right = isValid(root.right, root.data, max);
            return right;
        }

        return false;
    }


    public TreeNode findClossest(TreeNode root,int key){


        if(root==null){
            return null;
        }

        TreeNode clossest=null;
        int minDiff=Integer.MAX_VALUE;

        while(root!=null){

            int curDif=Math.abs(minDiff-key);

            if(minDiff>curDif){

                minDiff=curDif;
                clossest=root;
            }


            if(key<root.data){
                root=root.left;
            }

            else if(key>root.data){
                root=root.right;

            }
            else{

                break;

            }
        }

        return clossest;
    }

    public static void main(String[] args) {

        BST tree = new BST();

        int[] ar = { 1, 5, 6, 3, 4 ,10};

        for (int i = 0; i < ar.length; i++) {
            tree.insert(ar[i]);
        }

        if (tree.search(tree.root, 4) != null) {

            System.out.println("Key Found");
        } else {
            System.out.println("Key Doesnt found");
        }

        tree.preOrder(tree.root);
        System.out.println();
        tree.inOrder(tree.root);
        System.out.println();
        tree.postOrder(tree.root);

        System.out.println();

        System.out.println(tree.isValidBST(tree.root));


      TreeNode elem=tree.findClossest(tree.root, 11);

      System.out.println(elem.data);
    }
}