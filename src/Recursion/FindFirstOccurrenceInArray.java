package Recursion;

public class FindFirstOccurrenceInArray {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int target = 5;
        System.out.println(firstOccurrence(arr, target, 0, arr.length-1));
    }
    public static int firstOccurrence(int[] arr, int target, int lo, int hi){
        if(lo>hi) return -1;
        int mid = lo + (hi-lo)/2, idx = -1;
        if(arr[mid] == target) {
            idx = mid;
            int left = firstOccurrence(arr, target, lo, mid-1);
            if(left == -1) return idx;
            else return left;
        }
        else if(arr[mid]<target)  return firstOccurrence(arr, target, mid+1, hi);
        else return firstOccurrence(arr, target, lo, mid-1);
    }
}
