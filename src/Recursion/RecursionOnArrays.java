package Recursion;

public class RecursionOnArrays {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 3, 2, 15};
       // recPrint(arr, 0);
        System.out.println(exists(arr, 20, 0));
    }

    private static boolean exists(int[] arr, int ele, int i) {
        if(i== arr.length) return false;
        if(arr[i] == ele) return true;
        return exists(arr, ele, i+1);
    }


    public static void recPrint(int[] arr, int i){
        if(i == arr.length) return;
        System.out.print(arr[i] + " ");
        recPrint(arr, i+1);
    }
}
