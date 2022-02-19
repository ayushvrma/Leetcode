package Algorithms_1.Day_6;

import java.util.*;

public class longest_substring {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        String output = "";
        int start,end;
        for(start = 0, end=0; end<s.length();end++){
            char ch = s.charAt(end);
            if(map.containsKey(ch)){
                start = Math.max(map.get(ch)+1, start);
            }
            if(output.length()<end-start +1){
                output = s.substring(start,end+1);
            }
            map.put(ch, end);
        }
        return output.length();
}
}
