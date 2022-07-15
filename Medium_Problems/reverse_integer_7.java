package Medium_Problems;

public class reverse_integer_7 {
    public int reverse(int x){
        long num = 0;
        while(x!=0){
            num = x%10 +num*10;
            x/=10;
        }
        if(num<Integer.MIN_VALUE || num>Integer.MAX_VALUE) return 0;
        return (int)num;
    }
    public static void main(String[] args) {
        System.out.println(new reverse_integer_7().reverse(
                1056389759));
        // System.out.println(Integer.MIN_VALUE);
    }
}
