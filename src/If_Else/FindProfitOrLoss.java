package If_Else;

import java.util.Scanner;

public class FindProfitOrLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost price: ");
        int cp = sc.nextInt();
        System.out.println("Enter selling price: ");
        int sp = sc.nextInt();
        if(sp>cp) {
            System.out.println("Profit made: " + (sp-cp));
        }
        else if (sp == cp) {
            System.out.println("NO Profit No Loss");
        } else {
            System.out.println("Loss of " + -(sp-cp) + " rupees");
        }
    }
}
