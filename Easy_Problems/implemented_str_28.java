package Easy_Problems;

public class implemented_str_28 {
    public int strStr(String haystack, String needle) {
        int len = needle.length();
        if(needle.length()==0) return 0;
        for(int i=0; i<haystack.length()-len;i++){
            String s = haystack.substring(i,len+1);
            if(s==needle)
                return i;
        }
        return -1;
    }
}
