package Arrays;

import java.util.Scanner;

public class PrintNegativeElementsInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int len = sc.nextInt();
        System.out.print("Enter " + len + " values: " + " ");
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < len; i++) {
            if(arr[i] < 0) System.out.print(arr[i] + " ");
        }
    }
}
