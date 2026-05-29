package Methods;

import java.util.Scanner;

public class MaxOfFourNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter four numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int c1 = Math.max(a,b);
        int c2 = Math.max(c,d);
        System.out.println(Math.max(c1, c2));
    }
}
