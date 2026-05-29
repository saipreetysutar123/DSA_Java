package If_Else;

import java.util.Scanner;

public class NumberDivisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        if(n%3 == 0 && n%5 == 0) System.out.println("Number is divisible by 3 and 5");
        if(n%3 == 0) System.out.println("Number is divisible by 3");
        if(n%5 == 0) System.out.println("Number is divisible by 5");
        if(n%5 ==0 || n%3 == 0) System.out.println("Number is divisible by 5 or 3");
        else System.out.println("Number is neither divisible by 5 nor 3");
    }
}
