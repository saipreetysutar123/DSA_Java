package TwoDimensionalArrays;

public class MultiplyMatrices {
    public static void multiply(int[][] A, int[][] B, int[][] C){
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                C[i][j] = A[i][j]*B[j][i];
            }
        }
        for (int[] arr : C){
            for (int ele : arr){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int A[][] = {{7, 8}, {2 , 9}};
        int B[][] = {{14, 5}, {5, 18}};

        int[][] C = new int[A.length][B.length];
        multiply(A, B, C);
    }
}
