package SortingAlogithms;

public class CheckIfArrayIsSorted {
    public static boolean checkArray(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6};
        if(checkArray(arr)) System.out.println("True");
        else System.out.println("False");

    }
}
