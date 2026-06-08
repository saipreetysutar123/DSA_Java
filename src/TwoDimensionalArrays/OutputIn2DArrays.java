package TwoDimensionalArrays;

public class OutputIn2DArrays {
    public static void main(String[] args) {
//        int[][] arr = new int[3][4];
        int[][] arr = {{6,0,2,4},{1,2,3,4},{5,6,7,8}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        // to find length of rows in an array:
        System.out.println(arr.length);

        // to find length of cols in an array:
        System.out.println(arr[0].length);
    }
}
