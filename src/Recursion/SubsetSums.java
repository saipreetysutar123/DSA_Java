package Recursion;

import java.util.ArrayList;
import java.util.Collections;

public class SubsetSums {
    public static void main(String[] args) {
        int[] arr = {2, 3};
        ArrayList<Integer> ans = new ArrayList<>();
        subset(0, arr, 0, ans);
        Collections.sort(ans);
        System.out.println(ans);
    }

    public static void subset(int ans, int[] arr, int idx, ArrayList<Integer> list){
        if(idx == arr.length) {
            list.add(ans);
            return;
        }
        int num = arr[idx];
        subset(num+ans, arr, idx+1, list);
        subset(ans, arr, idx+1, list);
    }
}
