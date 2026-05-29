package If_Else;

import java.util.Scanner;

public class FourDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        if(n>999 && n<10000) System.out.println("Number is a four digit number");
        else System.out.println("It is not a four digit number");
    }
}
