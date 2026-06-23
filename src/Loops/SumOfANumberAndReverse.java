package Loops;

public class SumOfANumberAndReverse {
    public static void main(String[] args) {
        int sum=0, digit, n=1234, rev = 0;
        while(n!=0){
            rev *= 10;
            digit = n%10;
            sum += digit;
            rev += digit;
            n /= 10;
        }
        System.out.println("Sum: "+sum);
        System.out.println("Reverse: "+rev);
//        while(n!=0){
//            rev = rev * 10;
//            digit = n%10;
//            rev += digit;
//            n/=10;
//        }
    }
}
