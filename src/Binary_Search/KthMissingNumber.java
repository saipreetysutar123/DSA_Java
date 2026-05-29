package Binary_Search;

public class KthMissingNumber {
        public static int kthMissing(int[] arr, int k) {
            // code here
            int lo = 0, hi = arr.length - 1;
            while(lo<=hi){
                int mid = (lo+hi)/2;
                int correctNo = mid + 1;
                int missing = arr[mid] - correctNo;
                if(missing >= k) hi = mid - 1;
                else lo = mid + 1;
            }
            return hi + 1 + k;
        }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        System.out.println("Kth missing number is: " + kthMissing(arr, 5));
    }
}
