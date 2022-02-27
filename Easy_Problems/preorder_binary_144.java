package Easy_Problems;
import java.util.*;

public class preorder_binary_144 {
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> nums = new ArrayList<Integer>();
        if (root == null)
            return nums;
        Stack<TreeNode> s = new Stack<>();
        s.add(root);
        while(!s.isEmpty()){
            TreeNode t = s.pop();
            nums.add(t.val);
            if(t.right!=null)
            s.add(t.right);
            if(t.left!=null)
            s.add(t.left);
        }
        return nums;
    }
}
