package Arrays;

public class RotateArray {
    public static void reverse(int[] arr, int i, int j){
        int temp;
        while(i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void rotate(int[] arr, int target){
        int n = arr.length;
        reverse(arr, 0, target-1);
        reverse(arr, target, n-1);
        reverse(arr, 0, n-1);
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {6, 8, 1, 2, 4, 9, 0};
        int target = 2;
        rotate(arr, target);
    }
}
