package CyclicSort;

import java.util.ArrayList;

import static CyclicSort.CyclicSort.swap;

public class FindDisappearedNumber {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDuplicates(nums));
    }
    public static ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        while(i<arr.length){
            int idx = arr[i] - 1;
            if(arr[i] == i+1 || arr[idx] == arr[i]) i++;
            else swap(arr, i, idx);
        }
        for (i = 0; i < arr.length; i++) {
            if(arr[i] != i+1) ans.add(i+1);
        }
        return ans;
    }
}
