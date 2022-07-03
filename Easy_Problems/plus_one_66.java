package Easy_Problems;

import java.util.Arrays;

public class plus_one_66 {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1; i>=0; i++){
            if(digits[i]<9){
                digits++;
                return digits;
            }
            digits[i]=0;
        }
        int[] result = new int[digits.length +1];
        result[0] = 1;
        System.out.print(result);
        return result;
    }
}
