package Easy_Problems;

import java.util.HashMap;

public class single_number_136 {
    public int singleNumber(int[] nums){
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (h.containsKey(nums[i])) {
                h.put(nums[i], 2);
            } else {
                h.put(nums[i], 1);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (h.get(nums[i]) == 1)
                return nums[i];
        }
        return -1;
    }
}
