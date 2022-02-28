package Easy_Problems;
import java.util.*;
public class summer_island_228 {
    HashSet<Integer> s = new HashSet<Integer>();
    public List<String> summaryRanges(int[] nums) {
        List<String> l = new ArrayList<String>();
        for(int i=0; i<nums.length;i++)
        {
            System.out.println(nums[i]);
            if(!s.contains(nums[i])){
                int streak = func(i,nums);
                System.out.println(streak);
                if(streak==nums[i])
                l.add(Integer.toString(nums[i]));
                else{
                    l.add(Integer.toString((nums[i]))+"->"+Integer.toString(streak));
                    s.add(streak);
                }
            }
        }
        return l;
    }
        int func(int i, int[] nums){
            while(i<nums.length-1){
                s.add(nums[i]);
                if(!(nums[i+1]-nums[i]==1)) break;
            }
            return nums[i];
        }
}
