package Medium_Problems;
import java.util.*;
public class recover_bst_99 {
    public void recoverTree(TreeNode root) {
        Stack<TreeNode> s = new Stack<TreeNode>();
        s.push(root);
        int min= root.val;
        HashMap<Integer, TreeNode> m = new HashMap<>();
        m.put(root.val, root);
        while (!s.isEmpty() || root != null) {
            while (root != null) {
                s.push(root);
                root = root.left;
            }
            root = s.pop();
            m.put(root.val, root);
            if (root.val <= min){
                TreeNode t = m.get(min);
                int temp = t.val;
                t.val = root.val;
                root.val = temp;
                break;
            }
            min = root.val;
            root = root.right;
        }
    }
}
