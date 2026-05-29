package If_Else;

import java.util.Scanner;

public class ternaryInVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = (n>=0) ? 100 : 0;
        System.out.println(num);
    }
}
