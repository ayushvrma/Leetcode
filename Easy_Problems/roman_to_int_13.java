package Easy_Problems;
import java.util.*;

/**
 * roman_to_int_13
 */
public class roman_to_int_13 {
    public int romanToInt(String s) {
        int num=0;
        HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
        for(int i=s.length()-1; i>=0;i--){
            char ch = s.charAt(i);
            if(ch=='I'){
                if(h.isEmpty()){
                    num+=1;
                }
                else{
                    num+=-1;
                }
            }
            else if(ch=='V'){
                h.put(5, 1);
                num+=5;
            }
            else if(ch=='X'){
                h.put(10, 1);
                if(h.containsKey(50)||h.containsKey(100)||h.containsKey(500)||h.containsKey(1000)){
                    num-=10;
                }
                else{
                    num+=10;
                }
            }
            else if(ch=='L'){
                h.put(50, 1);
                num+=50;
            }
            else if(ch=='C'){
                h.put(100, 1);
                if(h.containsKey(500)||h.containsKey(1000))
                    num-=100;
                else{
                    num+=100;
                }
            }
            else if(ch=='D'){
                h.put(500, 1);
                num+=500;
            }
            else if(ch=='M'){
                h.put(1000, 1);
                num+=1000;
            }
        }
        return num;
    }
}