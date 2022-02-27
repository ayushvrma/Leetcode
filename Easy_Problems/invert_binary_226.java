package Easy_Problems;
public class invert_binary_226 {
    public TreeNode invertTree(TreeNode root) {
        if(root==null || (root.left==null && root.right==null)) return root;
        TreeNode t = root.left;
        root.left = root.right;
        root.right = t;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}