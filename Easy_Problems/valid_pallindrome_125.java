package Easy_Problems;

public class valid_pallindrome_125 {

// 11% faster

    // public boolean isPallindrome(String s){
    //     String str="";
    //     s = s.toLowerCase();
    //     for(int i=0;i<s.length();i++){
    //         String c = s.charAt(i);
    //         if(c>='a'&&c<='z'){
    //             str = str.concat(c);
    //         }
    //     }
    //     return str.equals(new StringBuilder(str).reverse().toString());
    // }



//20% faster
    public boolean isPallindrome(String s){
        String str = "";
        s = s.toLowerCase();
        for (char c : s.toCharArray()){
            if(Character.isLetter(c) || Character.isDigit(c)){
                str+=c;
            }
        }
        int a = 0, b = str.length()-1;
        while(a<b){
            if(str.charAt(a)!=str.charAt(b))
                return false;

            a++;b--;
        }
        return true;
    }
}
