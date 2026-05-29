package If_Else;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n<0) {
            n = -n;
            System.out.println("Magnitude " +n);
        }
        else{
            System.out.println("Magnitude " +n);
        }
    }
}
