package Trees;

public class RecursivePostOrderinBinaryTree {
    private static TreeNode root;
    private static class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;
        public TreeNode(int data){
            this.data = data;
        }
    }
    private static void RecursivePostOrder(TreeNode root){
        if(root == null){
            return;
        }
        RecursivePostOrder(root.left);
        RecursivePostOrder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
        root = new TreeNode(5);

        root.left = new TreeNode(3);
        root.right = new TreeNode(7);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(8);

        RecursivePostOrder(root);
    }
}
