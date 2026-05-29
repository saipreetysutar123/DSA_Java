package If_Else;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter a number: ");
        if(n%5 == 0){
            System.out.println("Divisible by 5");
        }
        else{
            System.out.println("Not divisible by 5");
        }
    }
}
