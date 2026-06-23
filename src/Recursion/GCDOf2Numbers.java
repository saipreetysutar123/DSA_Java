package Recursion;

public class GCDOf2Numbers {
    public static void main(String[] args) {
        System.out.println(gcd(12, 16));
    }
    public static int gcd(int a, int b){
//        int hcf = 1;
//        for (int i = 2; i < Math.min(a,b); i++) {
//            if(a%i==0 && b%i==0){
//                hcf = i;
//            }
//        }
        if(a==0) return b;
        return gcd(b%a, a);
    }
//        int num1 = 12, num2 = 16;
//        while (num2 != 0){
//            int temp = num2;
//            num2 = num1 % num2;
//            num1 = temp;
//        }
//        System.out.println("HCF: "+ num1);
}