package Medium_Problems;

public class two_sum_167 {
    public int[] twoSum(int[] numbers, int target) {
        int a = 0, b = numbers.length-1, sum=0;
        while(a<b){
            sum = numbers[a]+numbers[b];
            if(sum==target)
                return new int[]{a+1,b+1};
            if(sum > target){
                b-=1;
            }
            if(sum< target){
                a+=1;
            }
        }
        return new int[2];
    }
}
