package CyclicSort;

import static CyclicSort.CyclicSort.swap;

public class MissingInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        System.out.println(missing(arr));
    }
    public static int missing(int[] arr){
        int n = 1 + arr.length;
        int i = 0;
        while(i< arr.length){
            if(arr[i] == i+1 || arr[i] == n) i++;
            else{
                int idx = arr[i] - 1;
                swap(arr, i, idx);
            }
        }
        for (i = 0; i < arr.length; i++) {
            if(arr[i] != i+1) return i+1;
        }
        return n;
    }
}
