package SortingAlogithms;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonElements {
    public static ArrayList<Integer> commonElements(int[] a, int[] b){
        Arrays.sort(a);
        Arrays.sort(b);
        ArrayList<Integer> ans = new ArrayList<>();
        int i=0, j=0;
        while(i<a.length && j<b.length){
            if(a[i] == b[j]) {
                ans.add(a[i]);
                i++;
                j++;
            }
            else if(a[i] < b[j]) i++;
            else j++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a = {3, 1, 2, 1, 1, 4, 5, 5};
        int[] b = {6, 1, 1, 4, 4, 2, 8};
        for(int ele : commonElements(a, b)){
            System.out.print(ele + " ");
        }
    }
}
