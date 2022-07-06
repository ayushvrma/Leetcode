package Easy_Problems;

import java.util.HashMap;

public class single_number_136 {
    // public int singleNumber(int[] nums){
    //     HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
    //     for (int i = 0; i < nums.length; i++) {
    //         if (h.containsKey(nums[i])) {
    //             h.put(nums[i], 2);
    //         } else {
    //             h.put(nums[i], 1);
    //         }
    //     }
    //     for (int i = 0; i < nums.length; i++) {
    //         if (h.get(nums[i]) == 1)
    //             return nums[i];
    //     }
    //     return -1;
    // }

    // HashSet + O(n)
    // public class Solution {
    // public int singleNumber(int[] nums) {
    //     Set< Integer > s = new HashSet<>();
    //     int l = nums.length;
        
    //     for( int i = 0; i < l; i++ ){
    //         if( s.contains( nums[i] ) ){
    //             s.remove( nums[i] );
    //         }else{
    //             s.add( nums[i] );
    //         }
    //     }
    //     return  s.toArray(new Integer[1] )[0] ;
    // }
    // }

    // XOR --- A^A = 0 A^A^B = A^B^A = B. so xor add all the digits, cause the same ones will get cancelled out and only the one that is unique will remain
    /*
     * XOR or
     * Exclusive Or
     * is a
     * logical operation
     * that outputs*true
     * only when
     * 
     * inputs differ (one is true, the other is * false). * * In this case, the
     * program will traverse through the array * adding each number to the result
     * until it comes to a number * it has already added. Instead of adding a number
     * again, the * program will subtract the number from result. When the *
     * for-loop has completed, the result will be the number * that was added but
     * not subtracted.
     */

    public int singleNumber(int[] nums) {

        int l = nums.length;
        int res = nums[0];
        for (int i = 1; i < l; i++) {
            res ^= nums[i];
        }
        return res;
    }

}
