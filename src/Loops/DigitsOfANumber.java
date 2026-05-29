package Loops;

import java.util.Scanner;

public class DigitsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find number of digits: ");
        int n = sc.nextInt();
        int count=0;
        if(n==0) count=1;
        while(n!=0){
            n /= 10;
            count++;
        }
        System.out.println(count);
    }
}
