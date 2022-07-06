package Easy_Problems;

public class fibionacci_509 {
    public int fib(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        return fib(n-2)+fib(n-1);
    }
    public static void main(String[] args) {
        System.out.println(new fibionacci_509().fib(4));
    }
}
