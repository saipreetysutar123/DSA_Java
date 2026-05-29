package SortingAlogithms;

import java.util.Arrays;

public class TwoSumUsingSort {
    public static int[] twoSum(int[] arr, int target){
        int i = 0, j = arr.length - 1;
        Arrays.sort(arr);
        int[] index = new int[2];
        while(i<j){
            if(arr[i] + arr[j] == target){
                index[0] = i;
                index[1] = j;
                return index;
            } else if (arr[i] + arr[j] > target) j--;
            else {
                index[0] = -1;
                index[1] = -1;
                i++;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr = {7, 0, 4, 3, 2, 8, 10};
        int target = 9;
        System.out.print("Index: ");
        for(int ele : twoSum(arr, target)){
            System.out.print(ele + " ");
        }
    }
}
