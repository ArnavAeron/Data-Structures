package Trees;

public class RepresentationOfBinaryTree {
    private TreeNode root;
    private static class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;
        public TreeNode(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        RepresentationOfBinaryTree rbt = new RepresentationOfBinaryTree();
        rbt.root = new TreeNode(5);
        rbt.root.left = new TreeNode(3);
        rbt.root.right = new TreeNode(7);

        rbt.root.left.left = new TreeNode(2);
        rbt.root.left.right = new TreeNode(4);

        rbt.root.right.left = new TreeNode(6);
        rbt.root.right.right = new TreeNode(9);


        System.out.println("Binary Tree created with root value : "+rbt.root.data);

    }
}
