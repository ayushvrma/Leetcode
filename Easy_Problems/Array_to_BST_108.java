package Easy_Problems;

public class Array_to_BST_108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0)
            return null;
        return constructTree(nums, 0, nums.length - 1); //divide and conquor problem.
    }

    public TreeNode constructTree(int[] nums, int left, int right) {
        if (left > right)
            return null;
        // whenever sorted array is given, think about Binary Search.
        int root = (left + right) / 2;
        TreeNode r = new TreeNode(nums[root]);
        r.left = constructTree(nums, left, root - 1);
        r.right = constructTree(nums, root + 1, right);
        return r;
    }
}
