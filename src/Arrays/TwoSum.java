package Arrays;

public class TwoSum {
    public static boolean twoSum(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, -3};
        int target = 9;
        if(twoSum(arr, target)){
            System.out.println("Target present");
        }else System.out.println("Target not there");

    }
}
