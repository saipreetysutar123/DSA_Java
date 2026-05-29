package Loops;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find out factor: ");
        int n = sc.nextInt();
        // Optimized way
        for(int i=1; i<=Math.sqrt(n); i++){
            if(n%i==0){
                System.out.println(i);
                System.out.println(n/i);
            }
        }
        // Simple way
//        for(int i=1; i<=n; i++){
//            if(n%i==0){
//                System.out.println(i);
//            }
//        }
    }
}
