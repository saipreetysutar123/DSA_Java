package Recursion;

public class PowerOfNumbers {
    public static void main(String[] args) {
        System.out.println(reverseExponential(2));
    }
    public static int pow(int a, int b){
        if(b==0) return 1;
        if(b%2==0) return pow(a, b/2)*pow(a, b/2);
        else return a*pow(a, b/2)*pow(a, b/2);
    }
    public static int reverseExponential(int n){
        if(n==10) return 10;
        return pow(n, n);
    }
}
