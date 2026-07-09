package MergeSort;

public class MergeSortUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 4, 1, 6, 7, 3};
        mergeSort(arr);
        for (int ele : arr) System.out.print(ele+" ");
    }
    public static void mergeSort(int[] arr){
        int n = arr.length;
        if(n==1) return;
        // step 1 : Create 2 new array of size n/2 and n-n/2
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        // Step 2 : Copy-paste arr into a and b
        int idx = 0;
        for (int i=0; i<a.length; i++) a[i] = arr[idx++];
        for (int i=0; i<b.length; i++) b[i] = arr[idx++];
        // step 3 : recursion
        mergeSort(a); mergeSort(b);
        // step 4 : Merge 'a' and 'b' into arr
        merge(a, b, arr);
    }
    public static void merge(int[] a, int[] b, int[] c){
        int i=0, j=0, k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while(i<a.length) c[k++] = a[i++];
        while (j<b.length) c[k++] = b[j++];
    }
}
