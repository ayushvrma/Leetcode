package Easy_Problems;

public class excel_col_171 {
    public int titleToNumber(String columnTitle){
        int n=0;
        columnTitle = new StringBuilder(columnTitle).reverse().toString();
        for(int i=0; i<columnTitle.length();i++){
            System.out.println(columnTitle.charAt(i));
            int c= (int) (columnTitle.charAt(i)-'A')%26 +1;
            n+= c*  (int)Math.pow(26, i);
        }
        return n;
    }
    public static void main(String[] args) {
        System.out.println(new excel_col_171().titleToNumber("ZY"));
    }
}
