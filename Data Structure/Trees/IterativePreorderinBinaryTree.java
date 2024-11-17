package Trees;
import java.util.Stack;
public class IterativePreorderinBinaryTree {
    private static TreeNode root;
    private static class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;
        public TreeNode(int data){
            this.data = data;
        }
    }
    private static void IterativePreorder(){
        if(root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            System.out.print(temp.data+" ");
            if(temp.right != null){
                stack.push(temp.right);
            }
            if(temp.left != null){
                stack.push(temp.left);
            }
        }
    }
    public static void main(String[] args) {
// Level - 0  (Root Node)
        root = new TreeNode(1);
// Level - 1 (Left and Right Sub Tree)
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
// Level - 2  (Left Sub-Tree)
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
// Level - 2  (Right Sub-Tree)
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        IterativePreorder();
    }
}
