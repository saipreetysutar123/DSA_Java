package Arrays;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int len = sc.nextInt();
        System.out.print("Enter the elements in the array: ");
        int[] arr = new int[len];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] < min) min = arr[i];
        }
        System.out.print("The minimum of array is: " + min);
    }
}
