package Easy_Problems;

import java.util.HashMap;

public class anagram_242 {
    public boolean isAnagram(String s, String t){
        if(s.length()!=t.length()) return false;
        int[] freq = new int[26];
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        for(int i: freq){
            if(i!=0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(new anagram_242().isAnagram("anagram", "nagaram"));
    }
}
