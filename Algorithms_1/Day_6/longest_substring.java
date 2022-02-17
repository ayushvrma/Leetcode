package Algorithms_1.Day_6;

import java.util.*;

public class longest_substring {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
            return 0;
        String sub="";
        int longest = s.length();
        while(longest>=1){
            for(int i=0; i<=s.length()-longest;i++){
            sub = s.substring(i,i+longest);
             Set<String> hashSet = new HashSet<String>(Arrays.asList(sub.split("")));
             if(sub.length()==hashSet.size()){
                 return sub.length();
             }
            }
            longest--;
        }
        return 1;
}
}
