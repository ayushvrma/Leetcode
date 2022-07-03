package Easy_Problems;

public class sqrtx_69 {
    public int mySqrt(int x) {
        int left = 1;
        int right = x/2;
        int mid;
        while(left<=right){
            mid = (left+right)/2;
            if(mid*mid<x){
                left = mid+1; //means we guessed way too less so reduce the lower limit
                continue;
            }
            if(mid*mid>x){
                right = mid-1; //means we guessed way too high so reduce the upper limit
                continue;
            }
            return mid;
        }
        return x; //for conditions x<=1, 
    }
    public static void main(String[] args) {
        System.out.println(new sqrtx_69().mySqrt(8));
    }
}
