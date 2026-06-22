package Recursion;

public class ReverseOfANumber {
    public static void main(String[] args) {
        int n = 1234, r=0;
        reverse(n, r);
    }
    public static void reverse(int n, int r){
        if(n==0){
            System.out.println(r);
            return;
        }
        reverse(n/10, r*10+n%10);
    }
}
