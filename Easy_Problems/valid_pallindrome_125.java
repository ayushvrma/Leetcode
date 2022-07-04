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



//13% faster
    public boolean isPallindrome(String s){
        String str="";
        s = s.toLowerCase();
        for(char c: s.toCharArray()){
            if(Character.isDigit(c) || Character.isLetter(c)){
                str+=c;
            }
        }
        int first_pointer = 0;
        int second_pointer = s.length()-1;
        while(first_pointer<=second_pointer) // onlly check till midway to save time
        {
            if(str.charAt(first_pointer)!=str.charAt(second_pointer))
                return false;
            first_pointer++;
            second_pointer--;
        }
        return true;
    }
}
