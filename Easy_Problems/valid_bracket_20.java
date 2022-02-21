package Easy_Problems;
import java.util.*;
public class valid_bracket_20 {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            System.out.println(st);
            if(ch=='('||ch=='{'||ch=='['){
                st.push(ch);
                continue;
            }
            else if(ch==')'){
                if(st.isEmpty() ||st.pop()!='(')
                    return false;
            } 
            else if (ch == '}') {
                if (st.isEmpty() ||st.pop() != '{')
                    return false;
            } 
            else if (ch == ']') {
                if (st.isEmpty() || st.pop() != '[')
                    return false;
            }
        }
        if(!st.empty())
            return false;
        return true;
    }
    public static void main(String[] args) {
        valid_bracket_20 o = new valid_bracket_20();
        System.out.println(o.isValid(")"));
    }
}
