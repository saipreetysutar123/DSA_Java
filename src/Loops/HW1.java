package Loops;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times you want to print your name: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println("Saipreety");
        }
    }
}
