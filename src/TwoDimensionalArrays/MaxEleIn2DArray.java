package TwoDimensionalArrays;

public class MaxEleIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {{4, 5, 6, 7}, {12, 6, 4, 89}, {125, 5, 6, 78},{122, 78, 45, 23}};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
