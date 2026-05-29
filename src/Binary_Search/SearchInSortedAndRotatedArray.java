package Binary_Search;

public class SearchInSortedAndRotatedArray {
    public static int search(int arr[], int key){
        int lo = 0, hi = arr.length - 1;
        while(lo <= hi){
            int mid = (lo+hi)/2;
            if(arr[mid]==key) return mid;
            else if(arr[lo]<=arr[mid]){
                if(arr[lo]<=key && key<arr[mid]) hi = mid - 1;
                else lo = mid + 1;
            }
            else{
                if(arr[mid]<key && key<=arr[hi]) lo = mid + 1;
                else hi = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        System.out.println("Ans: " + search(arr, 10));
    }
}
