package Algorithms_1.Day_6;

import java.util.Arrays;
import java.util.HashMap;


public class permutation_string {
    public boolean checkInclusion(String s1, String s2){
       int start = 0; int end = s1.length();
       s1.toLowerCase(); s2.toLowerCase();
        int arr[] = new int[26];
        for(int i=0; i<s1.length(); i++){
            arr[s1.charAt(i)-'a']++;
        }
        while(end<s2.length()){
            String temp = s2.substring(start,end);
            int arr2[] = new int[26];
            for (int i = 0; i < temp.length(); i++) {
                arr2[temp.charAt(i) - 'a']++;
            }
            if(Arrays.equals(arr, arr2))
                return true;
        }
       return false;
    }
    public static void main(String[] args) {
        permutation_string o = new permutation_string();
        System.out.println(o.checkInclusion("adc","acda"));
    }
}
//fastest soln

// class Solution {
//     public boolean checkInclusion(String s1, String s2) {
//         int[] map = new int[128];
//         for (char c : s1.toCharArray()) {
//             map[c]++;
//         }
//         int count = s1.length();
//         char[] chars = s2.toCharArray();
//         int left = 0, right = 0;
//         while (right < chars.length) {
//             if (map[chars[right++]]-- > 0) count--;
//             while (count == 0) {
//                 if (right - left == s1.length()) return true;
//                 if (++map[chars[left++]] > 0) count++;
//             }
//         }
//         return false;
//     }
// }
