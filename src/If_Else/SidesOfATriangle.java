package If_Else;

import java.util.Scanner;

public class SidesOfATriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st side: ");
        int side1 = sc.nextInt();
        System.out.print("Enter 2nd side: ");
        int side2 = sc.nextInt();
        System.out.print("Enter 3rd side: ");
        int side3 = sc.nextInt();
        if(side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) System.out.println("Valid Triangle");
        else System.out.println("Not a valid triangle");
    }
}
