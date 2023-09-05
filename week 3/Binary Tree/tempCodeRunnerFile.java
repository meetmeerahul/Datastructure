 public void createNode(TreeNode root,int val) {


        //    if(root==null){

        //     root=new TreeNode(val);
        //     return root;
        // }

        // if(val<root.data){

        //     root.left=insertNode(root.left, val);
        // }
        // else{
        //     root.right=insertNode(root.right,val);
        // }
        // return root;

        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode forth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);

        root = first;
        first.left = second;
        first.right = third;
        second.left = forth;
        second.right = fifth;
    }