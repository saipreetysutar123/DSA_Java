package Binary_Search;

import java.util.ArrayList;

public class FirstAndLastOccurrence {
    public static ArrayList<Integer> binarySearch(int[] arr, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        int lo = 0, hi = arr.length - 1;
        int idx1 = -1, idx2 = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == k) {
                idx1 = mid;      // store answer
                hi = mid - 1;   // move left to find first occurrence
            }
            else if (arr[mid] < k) {
                lo = mid + 1;
            }
            else {
                hi = mid - 1;
            }
        }
        lo = 0;
        hi=arr.length-1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == k) {
                idx2 = mid;      // store answer
                lo = mid + 1;   // move left to find first occurrence
            }
            else if (arr[mid] < k) {
                lo = mid + 1;
            }
            else {
                hi = mid - 1;
            }
        }
        ans.add(idx1);
        ans.add(idx2);
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int target = 5;
        System.out.println("Element found at index: "+binarySearch(arr, target));
    }
}