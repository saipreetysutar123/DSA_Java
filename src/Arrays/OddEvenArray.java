package Arrays;

import java.util.Scanner;

public class OddEvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the array: ");
        int len = sc.nextInt();
        System.out.print("Enter " + len + " elements: ");
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < len; i++) {
            if(i%2==0) arr[i] += 10;
            if(i%2!=0) arr[i] *= 2;
            System.out.println(arr[i]);
        }
    }
}
