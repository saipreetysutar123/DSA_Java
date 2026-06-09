package TwoDimensionalArrays;

public class SumOfAllElementsIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {{2, 8, 4, 3, 7}, {7, 2, 1, 6, 3}, {5, 5, 4, 1, 4}, {3, 1, 8, 2, 6}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
