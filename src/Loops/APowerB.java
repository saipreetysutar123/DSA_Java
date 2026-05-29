package Loops;

import java.util.Scanner;

public class APowerB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.print("Enter power: ");
        int m = sc.nextInt();
        int pow=1;
        for (int i = 1; i <= m ; i++) {
            pow *= n;
        }
        System.out.println(n+" raised to power " + m + " is: " + pow);
    }
}
