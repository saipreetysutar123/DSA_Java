package Loops;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number up to which you want to find the AP: ");
        int n = sc.nextInt();
//        int a = 99, d=-4;
//        for(int i=1; i<n; i++){
//            System.out.print(a + " ");
//            a += d;
//        }
        for(int i = 99; i>=103-4*n; i-=4){
            System.out.print(i+ " ");
        }
    }
}
