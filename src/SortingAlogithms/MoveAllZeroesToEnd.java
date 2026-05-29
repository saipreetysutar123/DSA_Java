package SortingAlogithms;

public class MoveAllZeroesToEnd {
    public static void moveAllZeroesToEnd(int[] arr){
        int n = arr.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] != 0){
                if(i != j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, -2, 3, 0, 4, 8, 0, 10, 12};
        moveAllZeroesToEnd(arr);
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
