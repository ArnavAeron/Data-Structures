package Trees;

public class RecursiveInorderinBinaryTree {
    private static TreeNode root;
    private static class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;
        public TreeNode(int data){
            this.data = data;
        }
    }
    public static void RecursiveInorder(TreeNode root){
        if(root == null){
            return;
        }
        RecursiveInorder(root.left);
        System.out.print(root.data+" ");
        RecursiveInorder(root.right);
    }
    public static void main(String[] args) {
        root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(8);

        RecursiveInorder(root);
    }
}
