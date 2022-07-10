package Easy_Problems;

import java.util.HashMap;

public class happy_number_202 {
    public boolean isHappy(int n){
        HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
        while(n>0){
            if(n==1) return true;
            if(h.containsKey(n)) return false;
            int num = square(n);
            h.put(n, num);
        }
        return false;
    }

    public int square(int n){
        int sum=0;
        while(n>0){
            sum += (int)Math.pow(n%10,2);
            n/=10;
        }
        return sum;
    }
}
