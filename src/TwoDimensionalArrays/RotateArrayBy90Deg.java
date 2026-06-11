package TwoDimensionalArrays;

class RotateArrayBy90Deg {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;

        // Transpose
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse each row
        for(int i = 0; i < n; i++) {
            int left = 0, right = n - 1;

            while(left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2,3 }, {4, 5, 6}};
        rotate(arr);
        for (int[] a : arr){
            for (int ele : a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
