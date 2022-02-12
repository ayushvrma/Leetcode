package Algorithms_1;

// implement in log n complexity
/**
 * binary_search
 */
public class binary_search {

    public int search(int[] nums, int target) {
        int start = 0;
        int last = nums.length - 1;
        int mid;
        while (start <= last) {
            mid = (start + last) / 2;
            System.out.println(mid);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                last = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        binary_search bs = new binary_search();
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(bs.search(nums, target));
    }
}