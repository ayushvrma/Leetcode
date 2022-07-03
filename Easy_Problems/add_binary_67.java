package Easy_Problems;

public class add_binary_67 {
    public static String addBinary(String a, String b) {
        String result = "";
        int i = a.length() - 1;
        int j = b.length() - 1;
        int sum = 0;
        while (i >= 0 || j >= 0) // this is for unequal strings
        {
            if(i>=0)sum += Integer.parseInt(String.valueOf(a.charAt(i)));
            if(j>=0)sum += Integer.parseInt(String.valueOf(b.charAt(j)));
            result = result.concat(Integer.toString(sum%2));
            sum = sum / 2;
            i--;
            j--;
        }
        if (sum !=0) {
            result = result.concat("1");
        }
        return new StringBuilder(result).reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(addBinary("111", "1"));
    }
}
