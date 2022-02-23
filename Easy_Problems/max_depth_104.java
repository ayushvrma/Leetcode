package Easy_Problems;


public class max_depth_104 {
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        int left_len = maxDepth(root.left);
        int right_len = maxDepth(root.right);
        
        return Math.max(left_len, right_len)+1;
    }
}
