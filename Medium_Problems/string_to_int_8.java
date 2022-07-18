package Medium_Problems;

public class string_to_int_8 {
    public int myAtoi(String s){
        s = s.trim();
        long num=0;
        int m = 1;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='-'){m = -1; continue;}
            if (ch == '+') continue;
            if(!Character.isDigit(ch)) break;
            int d = Integer.valueOf(Character.toString(ch));
            num = num*10 +d;
        }
        num = num*m;
        if(num>Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(num<Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int) num;
    }
    public static void main(String[] args) {
        System.out.println(new string_to_int_8().myAtoi("   -42 lmao"));
    }
}
