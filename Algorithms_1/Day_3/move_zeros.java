package Algorithms_1.Day_3;

public class move_zeros {
    public void moveZeroes(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == 0) {
                for (int j = i; j < nums.length - 1; j++) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
                boolean flag = false;
                for (int k = i; k < nums.length; k++) {
                    if (nums[k] != 0) {
                        flag = true;
                    }
                }
                if (nums[i] == 0 && !flag) {
                    i++;
                }
            }

            else {
                i++;
            }
        }
    }
}
