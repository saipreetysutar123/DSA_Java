package TwoDimensionalArrays;

import java.util.ArrayList;

public class MultiplyMatrices {
    public static ArrayList<ArrayList<Integer>> multiply(int[][] A, int[][] B){
        int[][] C = new int[A.length][B.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                for (int k = 0; k < C.length; k++) {
                    C[i][j] += A[i][k]*B[k][j];
                }
            }
        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            ans.add(new ArrayList<>());
            for (int j = 0; j < B.length; j++) {
                ans.get(i).add(C[i][j]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int A[][] = {{7, 8}, {2 , 9}};
        int B[][] = {{14, 5}, {5, 18}};

        System.out.println(multiply(A, B));
    }
}