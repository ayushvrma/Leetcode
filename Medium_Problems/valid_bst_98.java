package Medium_Problems;
import java.util.*;

public class valid_bst_98 {
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> s = new Stack<TreeNode>();
        double left_value = -Double.MIN_VALUE;
        while(!s.isEmpty() || root !=null){
            while(root!=null){
                s.push(root);
                root = root.left;
            }
            root = s.pop();
            if(root.val<=left_value) return false;
            left_value = root.val;
            root = root.right;
        }
        return true;
    }
}
