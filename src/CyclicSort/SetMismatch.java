package CyclicSort;

import java.util.ArrayList;

import static CyclicSort.CyclicSort.swap;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};
        for (int ele : findErrorNums(nums)) System.out.print(ele+" ");
    }
    public static int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        int i = 0;
        while(i<nums.length){
            int idx = nums[i] - 1;
            if(nums[i] == i+1 || nums[idx] == nums[i]) i++;
            else swap(nums, i, idx);
        }
        for (i = 0; i < nums.length; i++) {
            if(nums[i] != i+1) {
                ans[0] = nums[i];
                ans[1] = i + 1;
//                break;
            }
        }
        return ans;
    }
}
