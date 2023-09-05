

class test {

    
static class Node {

    Node left, right;
    int data;

    Node(int data) {

        this.data = data;
        right = left = null;

    }
}

   public Node root;

    public boolean isComplete(Node root){

        if(root==null){
            return true;
        }

        if(root.left==null && root.right==null){
            return true;
        }

        if(root.right!=null && root.left==null ||root.right==null && root.left!=null ){
            return false;
        }

        return(isComplete(root.left) && isComplete(root.right) );
    }

    public static void main(String[] args) {


        test tree = new test();
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


