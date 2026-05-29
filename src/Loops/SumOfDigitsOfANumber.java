package Loops;

import java.util.Scanner;

public class SumOfDigitsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sum=0, digit;
        while(n != 0){
            digit = n%10;
            sum += digit;
            n /= 10;
        }
        System.out.println((sum>0) ? sum : -sum);
    }
}
