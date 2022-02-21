package Easy_Problems;
import java.util.*;

public class majority_number_169 {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
        int max = nums[0];
        for(int i=0; i<nums.length; i++){
            if(h.containsKey(nums[i])){
                h.put(nums[i], h.get(nums[i])+1);

            }
            else{
                h.put(nums[i], 1);
            }
            if (h.get(nums[i]) >= h.get(max)) {
                max = nums[i];
            }
            System.out.println(nums[i]+" "+max+" "+h.get(max));
        }
        return max;
    }
    public static void main(String[] args) {
        majority_number_169 o = new majority_number_169();
        System.out.println(o.majorityElement(new int[]{3,3,4}));
    }
}
