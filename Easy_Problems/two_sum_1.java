package Easy_Problems;

import java.util.HashMap;

public class two_sum_1 {
    public int[] twoSum(int[] nums, int target) {
        //hashmaps have a lookup time of O(1), so that reduces the complexity from O(n2) to O(n).
     HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
     h.put(nums[0],0);
     for(int i=1; i<nums.length;i++)
     {
        int val = target - arr[i];
        if(h.containsKey(val))
        {
            return new int[] {i,h.get(val)};
        }
        else{
            h.put(nums[i], i);
        }
        return new int[] {0,0}; //any arbitary array to return, but question says a solution exists.
     }
    }
}
