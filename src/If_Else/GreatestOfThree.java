package If_Else;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int first = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int second = sc.nextInt();
        System.out.println("Enter 3rd number: ");
        int third = sc.nextInt();

        if(first>second && first>third) System.out.println("Greatest number is "+first);
        else if(second>first && second>third) System.out.println("Greatest number is "+ second);
        else System.out.println("Greatest number is "+third);
    }
}
