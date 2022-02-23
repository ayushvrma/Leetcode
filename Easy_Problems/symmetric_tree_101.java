package Easy_Problems;
import java.util.*;

public class symmetric_tree_101 {
    public boolean isSymmetric(TreeNode root) {
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        Stack<TreeNode> s2 = new Stack<TreeNode>();
        TreeNode p1 = root.left;
        TreeNode p2 = root.right;
        s1.push(p1);
        s2.push(p2);
        while(!s1.isEmpty() || !s2.isEmpty()){
            TreeNode n1 = s1.pop();
            TreeNode n2 = s2.pop();
            if (n1 == null && n2 == null)
                continue;
            if(n1==null || n2==null || n1.val!=n2.val)
                return false;
            s1.push(n1.left);
            s2.push(n2.right);
            s2.push(n2.left);
            s1.push(n1.right);
        }
        return true;
    }
}
