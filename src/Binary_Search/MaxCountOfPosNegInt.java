package Binary_Search;

public class MaxCountOfPosNegInt {
    public static int max(int[] nums){
        int n = nums.length;
        int neg = lowerBound(nums, 0);
        int posStart = upperBound(nums, 0);
        int pos = n - posStart;
        return Math.max(pos, neg);
    }
    public static int lowerBound(int[] nums, int target){
        int lo=0;
        int hi=nums.length-1;
        while(lo<hi){
            int mid = (lo+hi)/2;
            if(nums[mid] < target) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }
    static int upperBound(int[] nums, int target){
        int lo=0;
        int hi= nums.length-1;
        while(lo<hi){
            int mid = (lo+hi)/2;
            if(nums[mid] <= target) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }
    public static void main(String[] args) {
        int[] nums = {-3,-2,-1,0,1,1,2,4};
        System.out.println("Max: "+max(nums));
    }
}
