package SortingAlogithms;

public class SelectionSortUsingLargeElem {
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int max = Integer.MIN_VALUE, maxIndex = -1;
            for (int j = 0; j <= n-i-1; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    maxIndex = j;
                }
            }
            int temp = arr[n - i - 1];
            arr[n - i - 1] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {8, 4, 1, 9, -3, 6, 5};
        selectionSort(arr);
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
