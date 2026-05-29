package Arrays;

import java.util.Scanner;

public class ProductOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        int prod =1;
        System.out.println("Enter elements in array: ");
        // taking input of array
        for (int i = 0; i < len; i++) {
            int x = sc.nextInt();
            arr[i] = x;
            prod *= arr[i];
        }
        System.out.print("Product : " + prod);
    }
}
