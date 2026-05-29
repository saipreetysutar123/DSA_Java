package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class AddingOne {
    public static ArrayList<Integer> addOne(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        int carry=1;
        int n = arr.length;
        for (int i = n-1; i >=0 ; i--) {
            if(arr[i] + carry <= 9){
                ans.add(arr[i] + carry);
                carry = 0;
            }
            else{
                ans.add(0);
                carry = 1;
            }
        }
        if(carry == 1) ans.add(1);
        Collections.reverse(ans);
        for(int ele : ans){
            System.out.print(ele + " ");
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {9, 9, 9};
        addOne(arr);
    }
}
