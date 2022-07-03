package Easy_Problems;

public class add_binary_67 {
    public String addBinary(String a, String b) {
        String s="";
        int i=a.length()-1; int j=b.length()-1;
        while(i>=0 || j>=0){
            if(i>=0 && j>=0){
                if(a.charAt(i)==0 && b.charAt(i)==0)
                    s.concat("0");
                else if((a.charAt(i)==0 && b.charAt(i)==1)||(a.charAt(i)==1 && b.charAt(i)==0))
                    s.concat("1");
                else if(a.charAt(i)==0 && b.charAt(i)==0)
            }
        }
    }
}
