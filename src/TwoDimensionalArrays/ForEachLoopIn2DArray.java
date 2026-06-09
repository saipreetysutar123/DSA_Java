package TwoDimensionalArrays;

public class ForEachLoopIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {{2, 8, 4, 3, 7}, {7, 2, 1, 6, 3}, {5, 5, 4, 1, 4}, {3, 1, 8, 2, 6}};
        for (int[] a : arr){
            for (int ele : a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
