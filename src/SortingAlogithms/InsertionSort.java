package SortingAlogithms;

public class InsertionSort {
    public void insertionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int j=i;
            while(j>0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        InsertionSort ins = new InsertionSort();
        int[] arr = {4, 1, 7, 3, 3, 9, 2, 0, 8};
        ins.insertionSort(arr);
        // print arr
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
