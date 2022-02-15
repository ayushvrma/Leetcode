package Algorithms_1.Day_4;

public class reverse_words {
    public static String reverseString(String s) {
        String s2 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            s2 += s.charAt(i);
        }
        return s2;
    }

    public String reverseWords(String s) {
        String s2 = "";
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            s2 += reverseString(arr[i]);
            if (i != arr.length - 1) {
                s2 += " ";
            }
        }
        return s2;
    }
}
