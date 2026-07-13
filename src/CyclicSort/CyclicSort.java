package CyclicSort;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 2, 7, 0, 4, 6};
        int i = 0;
        while(i<arr.length){
            if(arr[i] == i) i++;
            else{
                int idx = arr[i];
                swap(arr, i, idx);
            }
        }
        for (int ele : arr) System.out.print(ele+" ");
    }
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
