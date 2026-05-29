package Binary_Search;

public class FloorInASortedArray {
    public static int search(int[] arr, int x){
        int n = arr.length;
        int lo = 0, hi = n-1, idx = -1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid] <= x) {
                lo = mid + 1;
                idx = mid;
            }
            else if(arr[mid] > x) hi = mid - 1;
            else return lo;
        }
        return idx;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int x = 11;
        System.out.println("Index: " + search(arr, x));
    }
}