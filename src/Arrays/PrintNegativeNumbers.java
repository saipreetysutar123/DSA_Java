package Arrays;

import java.util.Scanner;

public class PrintNegativeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter len of Array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            int x = sc.nextInt();
            arr[i] = x;
        }
        for (int i = 0; i < len; i++) {
            if(arr[i] > 0) System.out.println(arr[i] + " ");
        }
    }
}
