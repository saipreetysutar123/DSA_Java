package Binary_Search;

public class PeakIndexInAMountainArray {
    public static int search(int[] arr){
        int lo = 1, hi = arr.length-2;
        while(lo <= hi){
            int mid = (lo+hi)/2;
            if(arr[mid] < arr[mid+1] && arr[mid] > arr[mid-1]) lo = mid + 1;
            else if(arr[mid] > arr[mid+1] && arr[mid] < arr[mid-1]) hi = mid - 1;
            else return mid;
        }
        return 1;
    }
    public static void main(String[] args) {
        int arr[] = {0, 10, 15, 2};
        System.out.println("Peak index found at " + search(arr));
    }
}