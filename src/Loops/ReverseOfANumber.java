package Loops;

import java.util.Scanner;

public class ReverseOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int n = sc.nextInt();
        int digit, rev=0;
        while(n != 0){
            rev *= 10;
            digit = n%10;
            rev += digit;
            n /= 10;
        }
        System.out.println(rev);
    }
}
