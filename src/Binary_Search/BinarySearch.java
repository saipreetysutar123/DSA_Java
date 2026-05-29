package Binary_Search;

public class BinarySearch {
    public static int binarySearch(int[] arr, int k) {
        int lo = 0, hi = arr.length - 1;
        int ans = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == k) {
                ans = mid;      // store answer
                hi = mid - 1;   // move left to find first occurrence
            }
            else if (arr[mid] < k) {
                lo = mid + 1;
            }
            else {
                hi = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {12, 12, 23, 45, 45, 67, 89, 96, 102, 334, 543};
        int target = 45;
        System.out.println("Element found at index: "+binarySearch(arr, target));
    }
}