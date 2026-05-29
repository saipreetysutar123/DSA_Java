package Binary_Search;

public class ReverseBinarySearch {
    public static int search(int arr[], int target){
        int hi=0, lo=arr.length-1;
        while(hi<=lo){
            int mid = (lo+hi)/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] < target) lo = mid - 1;
            else hi = mid + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {21, 13, 7, 4, 3, 1};
        int target = 13;
        int ans = search(arr, target);
        System.out.println(target + " found at index " + ans);
    }
}