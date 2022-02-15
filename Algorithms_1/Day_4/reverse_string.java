package Algorithms_1.Day_4;

public class reverse_string {
    public void reverseString(char[] s) {
        char[] s2 = new char[s.length];
        for (int i = s.length - 1; i >= 0; i--) {
            s2[s.length - 1 - i] = s[i];
        }
        for (int i = 0; i < s.length; i++) {
            s[i] = s2[i];
        }
    }
}
