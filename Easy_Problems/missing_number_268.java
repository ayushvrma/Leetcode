package Easy_Problems;

public class missing_number_268 {
    public int missingNumber(int[] nums){
        double exp = nums.length * (nums.length+1)/2;
        int sum = 0;
        for(int i: nums){
            sum+=i;
        }
        return (int)(exp-sum);
    }
}
// n(n+1)/2 total sum, minus sum of elements.
