package Loops;

import java.util.Scanner;

public class ReverseAndSumOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum=0, digits, rev=0;
        int revSum = 0;
        while(n != 0){
            rev *= 10;
            rev += (n%10);
            n /= 10;
        }
        while(n != 0){

            revSum = (n%10) + (rev%10);
            n /= 10;
            rev /= 10;
        }
        System.out.println(revSum);
    }
}
