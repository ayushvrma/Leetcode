package Easy_Problems;

import java.util.HashMap;

public class climbing_stairs_70 {
    public int climbStairs(int n) {
        HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
        return climb(n, 0, h);

    }
    public int climb(int step, int count, HashMap<Integer,Integer> h){
        if(step<0)
            return 0;
        if(step==0)
            return 1;
        else if(h.containsKey(step))
            return h.get(step);
        h.put(step, climb(step - 1, count, h) + climb(step - 2, count, h));
        return h.get(step);
    }

    public static void main(String[] args) {
        System.out.println(new climbing_stairs_70().climbStairs(3));
    }
}
