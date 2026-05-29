package Arrays;

public class Sort012 {
    public static void sort012(int[] arr){
        int numOf0s = 0;
        int numOf1s = 0;
        int numOf2s = 0;
        for(int ele : arr){
            if(ele == 0) numOf0s++;
            else if(ele == 1) numOf1s++;
            else numOf2s++;
        }
        int m = numOf0s + numOf1s;
        for (int i = 0; i < numOf0s; i++) {
            arr[i] = 0;
        }
        for (int i = numOf0s; i < m; i++) {
            arr[i] = 1;
        }
        for (int i = m; i < arr.length; i++) {
            arr[i] = 2;
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        sort012(arr);
    }
}
