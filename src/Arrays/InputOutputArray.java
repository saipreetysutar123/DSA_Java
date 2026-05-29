package Arrays;

import java.util.Scanner;

public class InputOutputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of arr: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.print("Enter " + len + " elements: ");
        for (int i = 0; i < len; i++) {
            int x = sc.nextInt();
            arr[i] = x;
        }

        System.out.println("Array: ");
        for (int i = 0; i < len; i++) {
            System.out.println(arr[i]);
        }
    }
}
