package If_Else;

import java.util.Scanner;

public class IntegerOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a real number: ");
        double n = sc.nextDouble();
        int x = (int)n;
        if(n-x == 0) System.out.println("It is an Integer");
        else System.out.println("It is not an Integer");
    }
}
