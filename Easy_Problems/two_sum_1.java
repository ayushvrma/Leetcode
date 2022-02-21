package Easy_Problems;

public class two_sum_1 {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length;j++){
                System.out.println(i+j);
                if((nums[i]+nums[j])==target){
                    return new int[]{i,j}; 
                }
            }
        }
        return new int[] { 0, 0 };
    }
    public static void main(String[] args) {
        two_sum_1 o = new two_sum_1();
        System.out.println( o.twoSum(new int[]{3,2,4}, 6));
    }
}
