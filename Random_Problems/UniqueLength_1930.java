//return the number of pallindromes of length three that are a subsequence of s
package Random_Problems;

import java.util.*;

/**
 * UniqueLength_1930
 */
public class UniqueLength_1930 {
    static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        }
        return true;
    }

    public int countPalindromicSubsequence(String s) {
        Set<String> palli = new HashSet<String>();
        for (int i = 0; i < s.length(); i++) {
            String temp = Character.toString(s.charAt(i));
            for (int j = i + 1; j < s.length(); j++) {
                temp += s.charAt(j);
                for(int z = j+1; z<s.length();z++){
                    temp +=s.charAt(z);
                    if(temp.length()==3 && isPalindrome(temp)){
                        palli.add(temp);
                        // System.out.println(temp+" palli");
                    }
                    else if(temp.length()==3){
                        // System.out.println(temp + " not palli");
                        temp = Character.toString(s.charAt(i))+ Character.toString(s.charAt(j));
                    }
                }
                temp = Character.toString(s.charAt(i));
            }
        }
        return palli.size();
    }
    public static void main(String[] args) {
        UniqueLength_1930 obj = new UniqueLength_1930();
        System.out.println(obj.countPalindromicSubsequence("aabca"));
    }
}