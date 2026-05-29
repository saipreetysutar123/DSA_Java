package Arrays;

public class MergeTwoSortedArrays {
    public static void MergeSort(int[] a, int[] b){
        int n = a.length;
        int m = b.length;
        int[] c = new int[n+m];
        int i=0, j=0, k=0;
        while(i<n && j<m){
            if(a[i] >= b[j]) c[k++] = b[j++];
            else c[k++] = a[i++];
        }
        if(i==n){ // if i gets over copy b to c
            while(j<m){
                c[k++] = b[j++];
            }
        }
        else{ // if i gets over copy b to c
            while(i<n){
                c[k++] = a[i++];
            }
        }
        for(int ele : c){
            System.out.print(ele +" ");
        }
    }
    public static void main(String[] args) {
        int[] a = {2, 5, 6, 9};
        int[] b = {1, 3, 4, 5, 10, 11};
        MergeSort(a, b);
    }
}
