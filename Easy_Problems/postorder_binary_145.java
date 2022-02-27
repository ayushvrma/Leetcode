package Easy_Problems;

import java.util.ArrayList;
import java.util.*;

public class postorder_binary_145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        if(root==null)
            return l;
        Stack<TreeNode> s= new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        s.add(root);
        while(!s.isEmpty()){
            TreeNode t = s.pop();
            s2.push(t);
            if (t.left != null)
                s.add(t.left);
            if(t.right!=null)
                s.add(t.right);
        }
        while(!s2.isEmpty())
            l.add(s2.pop().val);
        return l;
    }
}
