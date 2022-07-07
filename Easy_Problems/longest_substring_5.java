package Easy_Problems;

public class longest_substring_5 {
    public String longestPalindrome(String s){
        if(s==null || s.length()==0) return "";
        int start = 0;
        int end = 0;

        for(int i=0; i<s.length();i++){
            int len1 = fromMiddle(s, i, i); // for cases of racecar, e is middle character
            int len2 = fromMiddle(s, i, i+1); //for cases like abba, no middle character
            int len = Math.max(len1, len2); //the maximum of these 2 lengths
            if(len>end-start) //that means we found our current longest pallindrome string, starting with i as the middle element of the string
            {
                start = i - ((len-1)/2); //rac
                end = i+ (len/2); //car
            }
        }
        return s.substring(start,end+1);
    }

    public int fromMiddle(String s, int left, int right){
        if(s==null || left>right) return 0;
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }

        return right-left-1;
    }
    public static void main(String[] args) {
        System.out.println(new longest_substring_5().longestPalindrome(
                "aacabdkacaa"));
    }
}
