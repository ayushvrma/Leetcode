package Easy_Problems;

public class sqrtx_69 {
    public int mySqrt(int x) {
        int i=1;
        while(x/i*i!=0){
            i++;
            System.out.println(i);
        }
        return i-1;
    }
    public static void main(String[] args) {
        System.out.println(new sqrtx_69().mySqrt(2147483647));
    }
}
