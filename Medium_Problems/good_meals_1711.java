package Medium_Problems;

import java.util.HashMap;
import java.util.HashSet;

public class good_meals_1711 {

    public int countPairs(int[] deliciousness) {
        HashSet<Integer> h = new HashSet<>();
        for(int i=0; i<21;i++){
            h.add((int)Math.pow(2, i));
        }
        int i=0; int j=1; int count =0;
        while(i<j){
            if(j==deliciousness.length-1){
                i++;
                j = i+1;
            }
            System.out.println(deliciousness[i] + deliciousness[j]);
            if(h.contains(deliciousness[i]+deliciousness[j]))
                count++;
            j++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(Math.log10(a));
    }
}