package Easy_Problems;
import java.util.*;

public class binary_tree_inorder_94 {
    List<Integer> l = new ArrayList<Integer>();
    public void inorder(TreeNode node){
        if(node==null)
            return;
        inorder(node.left);
        l.add(node.val);
        inorder(node.right);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return l;
    }
}
