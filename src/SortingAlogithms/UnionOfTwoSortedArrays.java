package SortingAlogithms;
import java.util.ArrayList;

public class UnionOfTwoSortedArrays {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, j = 0;
        while(i < a.length && j < b.length){
            // Skip duplicates in a
            if(i > 0 && a[i] == a[i-1]){
                i++;
                continue;
            }
            // Skip duplicates in b
            if(j > 0 && b[j] == b[j-1]){
                j++;
                continue;
            }
            if(a[i] < b[j]){
                ans.add(a[i]);
                i++;
            }
            else if(a[i] > b[j]){
                ans.add(b[j]);
                j++;
            }
            else{ // equal elements
                ans.add(a[i]);
                i++;
                j++;
            }
        }
        // Remaining elements of a
        while(i < a.length){
            if(i == 0 || a[i] != a[i-1])
                ans.add(a[i]);
            i++;
        }
        // Remaining elements of b
        while(j < b.length){
            if(j == 0 || b[j] != b[j-1])
                ans.add(b[j]);
            j++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a = {2, 2, 3, 4, 5};
        int[] b = {1, 1, 2, 3, 4, 6, 8};
        for(int ele : findUnion(a, b)){
            System.out.print(ele + " ");
        }
    }
}
