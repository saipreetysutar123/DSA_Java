package Arrays;

import java.util.Scanner;

public class MaximumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int len = sc.nextInt();
        System.out.println("Enter the elements of array: ");
        int[] arr = new int[len];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            int x = sc.nextInt();
            arr[i] = x;
            if(arr[i]>max) max = arr[i];
        }
        System.out.println("Maximum of the array is: " + max);
    }
}
