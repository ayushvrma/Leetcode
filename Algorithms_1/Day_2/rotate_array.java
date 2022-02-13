package Algorithms_1.Day_2;

public class rotate_array {
    public void rotate(int[] nums, int k) {
        int[] rot = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i + k < nums.length) {
                rot[i + k] = nums[i];
            } else {
                rot[(i + k) % nums.length] = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rot[i];
        }
    }
}
