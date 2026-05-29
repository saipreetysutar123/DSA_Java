package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class HW1 {
    public static ArrayList<Integer> addingNum(int[] arr1, int[] arr2){
        ArrayList<Integer> ans = new ArrayList<>();
        int n1 = arr1.length;
        int n2 = arr2.length;
        int maxLen = Math.max(n1, n2);
        int[] a1 = new int[maxLen];
        int[] a2 = new int[maxLen];

        int diff1 = maxLen - n1;
        for (int i = 0; i < n1; i++) {
            a1[i + diff1] = arr1[i];
        }
        int diff2 = maxLen - n2;
        for (int i = 0; i < n2; i++) {
            a2[i + diff2] = arr2[i];
        }
        int carry = 0;
        for (int i = maxLen - 1; i >= 0 ; i--) {
            int sum = a1[i] + a2[i] + carry;
            int digit = sum % 10;
            carry = sum/10;
            ans.add(digit);
        }
        if(carry > 0) ans.add(carry);
        Collections.reverse(ans);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr1 = {3, 5, 0, 7};
        int[] arr2 = {9, 2, 1};
        for(int ele: addingNum(arr1, arr2)){
            System.out.print(ele + " ");
        }

    }
}
