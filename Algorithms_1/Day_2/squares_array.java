package Algorithms_1.Day_2;

public class squares_array {
    public int[] sortedSquares(int[] nums) {
            for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(Math.abs(nums[i])> Math.abs(nums[j])){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for(int i=0; i<nums.length; i++){
            nums[i]*= nums[i];
        }
        return nums;
    }
}
