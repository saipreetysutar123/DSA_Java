package Arrays;

import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {23, 18, 14, 1, 9};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Enter the element you want to find: ");
        int key = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key) System.out.print(key + " found at index " + i);
        }
    }
}
