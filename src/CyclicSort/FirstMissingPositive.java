package CyclicSort;

import static CyclicSort.CyclicSort.swap;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        System.out.println(firstMissingPositive(arr));
    }
    public static int firstMissingPositive(int[] arr){
        int i = 0;
        int n = arr.length;
        while(i<n){
            int idx = arr[i] - 1;
            if(arr[i] == i+1 || arr[i] <= 0 || arr[i]>n || arr[i]==arr[idx]) i++;
            else swap(arr, i, idx);
        }
        for (i=0; i<n; i++) {
            if(arr[i] != i+1) return i+1;
        }
        return n+1;
    }
}
