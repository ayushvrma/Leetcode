package Easy_Problems;
import java.util.*;

public class sum_left_leaves_404 {
    public int sumOfLeftLeaves(TreeNode root) {
        int sum=0;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode t= queue.removeFirst();
            if(t.left!=null && (t.left.left==null && t.left.right==null)){
                sum+= t.left.val;
            }
            if(t.right!=null)
            queue.add(t.right);
            if(t.left!=null)
            queue.add(t.left);
        }
        return sum;
    }
}
