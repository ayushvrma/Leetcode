package Easy_Problems;

public class pallindrome_9 {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int len = 0;
        int temp = x;
        int rev = 0;
        while(temp!=0){
            rev = rev*10 + temp%10;
            temp/=10;
            ++len;
        }
        while(rev!=0){
            if(rev%10!=x%10)
                return false;
            rev/=10;
            x/=10;
        }
        return true;
        }
    }
