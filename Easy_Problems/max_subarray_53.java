package Easy_Problems;

public class max_subarray_53 {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int i=0;
        while(i<nums.length){
            int j=i;
            while(j<nums.length){
                int s=0;
                for(int k=i;k<=j;k++)
                {
                    s+=nums[k];
                }
                if(s>sum) sum=s;
                j++;
            }
            i++;
        }
        return sum; 
    }
}
