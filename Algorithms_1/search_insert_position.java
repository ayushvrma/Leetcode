package Algorithms_1;

/**
 * search_insert_position
 */
public class search_insert_position {

    public int searchInsert(int[] nums, int target) {
        int s = 0;
        int l = nums.length - 1;
        int mid;
        while (s <= l) {
            mid = s + (l - s) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target) {
                s = mid + 1;
            } else {
                l = mid - 1;
            }
        }
        return s;
    }
}