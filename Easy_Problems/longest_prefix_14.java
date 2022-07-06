package Easy_Problems;

public class longest_prefix_14 {
    // public String longestCommonPrefix(String[] strs) {
    //     String min = strs[0];
    //     for(String s:strs){
    //         if(s.length()<min.length())
    //             min = s;
    //     }
    //     boolean contains = false;
    //     while(!contains){
    //         contains=true;
    //         for(int i=0; i<strs.length;i++){
    //             if(!strs[i].substring(0,min.length()).equals(min)){
    //                 System.out.println(strs[i].substring(0, min.length())+" "+min);
    //                 contains= false;
    //             }}
    //             if(!contains){
    //                 if(min.length()==1){
    //                     return "";
    //                 }
    //                 min = min.substring(0, min.length() - 1);
    //                 continue;
    //             }
    //             else{
    //                 return min;
    //             }
    //     }
    //     return min;
    // }
    public static void main(String[] args) {
        longest_prefix_14 o = new longest_prefix_14();
        System.out.println(o.longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }


    public String longestCommonPrefix(String[] strs) {
        String min = strs[0];
        for(int i=1; i<strs.length;i++){
            if(strs[i].length()==min.length()){
                min = strs[0];
            }
        }
        boolean found=false;
        while(!found)
        for(int i=0; i<strs.length;i++){

        }
    }
}
