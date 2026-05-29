package Loops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int x = 0;
        boolean flag = true;
//        for(int i=2; i<n; i++){
//            if(n%i==0){
//                flag = false;
//                break;
//            }
//        }

        //for(int i=2; i<n/2; i++){
//            if(n%i==0){
//                flag = false;
//                break;
//            }
//        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i==0){
                flag = false;
                break;
            }
        }
        if(!flag) System.out.println("Composite number");
        if(flag) System.out.println("Prime number");
    }
}
