package CyclicSort;

import static CyclicSort.CyclicSort.swap;

public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {3, 3, 3, 3, 3};
        System.out.println(findDuplicate(nums));
    }

    public static int findDuplicate(int[] nums){
        int i = 0;
        while(i<nums.length){
            if(nums[i] == i+1) i++;
            else{
                int idx = nums[i] - 1;
                if(nums[i] == nums[idx]) return nums[i];
                swap(nums, i, idx);
            }
        }
        return nums[nums.length-1];
    }
}
