package Easy_Problems;

public class len_last_58 {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int sp=0;int i=0;
        while(i<s.length()){
            if(s.charAt(i)==' ')
                sp=i;
                i++;
        }
        if(sp==0) return s.length();
        return s.substring(sp+1).length();
    }
}
