package Easy_Problems;

public class power_of_three_326 {
    public boolean isPowerOfThree(int n) {
        if(n==0) return false;
        if(n==1) return true;
        int low = 1;
        int high = n/2;

        while(low<high){
            int mid = (low+high)/2;
            if(mid*mid*mid == n)
                return true;
            if(n>mid*mid*mid){
                low = mid+1;
                continue;
            }
            if(n<mid*mid*mid){
                high = mid-1;
                continue;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(new power_of_three_326().isPowerOfThree(81));
    }
}
