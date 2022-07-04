package Easy_Problems;

public class sqrtx_69 {
    public int mySqrt(int x) {
        int left = 1;
        int right = x/2;
        int mid;
        while(left<=right){
            mid = (left+right)/2;
            if (mid > x / mid) {
                right = mid - 1; //means we guessed way too high so reduce the upper limit
                continue;
            }
            if ((mid + 1) <= x / (mid + 1)) {
                left = mid + 1; //means we guessed way too less so inc the lower limit
                continue;
            }
            //if mid+1 sq is not less than x and mid sq is also not greater than x, then were in the sweet spot.
            return mid;
        }
        return x; //for conditions x<=1, 
    }
    public static void main(String[] args) {
        System.out.println(new sqrtx_69().mySqrt(8));
    }
}
