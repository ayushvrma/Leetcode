package Easy_Problems;
import java.util.*;

public class same_tree_100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null || p.val != q.val) {
            return false;
        }
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        Stack<TreeNode> s2 = new Stack<TreeNode>();

        s1.push(p);
        s2.push(q);
        while(!s1.isEmpty() && !s2.isEmpty()){
            TreeNode s1_val = s1.pop();
            TreeNode s2_val = s2.pop();
            if(s1_val==null && s2_val==null)
                continue;
            if(s1_val==null || s2_val==null|| s1_val.val!=s2_val.val)
                return false;
            s1.push(s1_val.right);
            s2.push(s2_val.right);
            s1.push(s1_val.left);
            s2.push(s2_val.left);
        }
        return true;
    }
}
