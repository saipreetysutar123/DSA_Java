package Recursion;

public class ReverseOfANumber {
    public static void main(String[] args) {
        int n = 1000, r=0;
        System.out.println(reverse(n, r));
    }
    public static int reverse(int n, int r){
        if(n==0) return r;
        return reverse(n/10, r*10+n%10);
    }
}
