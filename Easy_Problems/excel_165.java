package Easy_Problems;

public class excel_165 {
    public String converToTitle(int columnNumber){
        String a="";
        while(columnNumber>0){
            a+= (char)(--columnNumber%26 +'A');
            columnNumber/=26;
        }
        return new StringBuilder(a).reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(new excel_165().converToTitle(701));
    }
}
