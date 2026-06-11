package TwoDimensionalArrays;

public class TransposeOfAMatrix {
// meth-2
    public static void print(int[][] arr){
        for(int[] a : arr){
            for (int ele : a){
                System.out.print(ele+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] arr = {{2, 8, 3, 4}, {7, 2, 1, 6}, {5, 5, 4, 1}, {3, 1, 8, 2}};
        print(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        print(arr);


        // meth-1
//        int[][] arr = {{2, 8, 4, 3, 7}, {7, 2, 1, 6, 3}, {5, 5, 4, 1, 4}, {3, 1, 8, 2, 6}};
//        for (int i = 0; i < arr[0].length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                System.out.print(arr[j][i]+" ");
//            }
//            System.out.println();
//        }
    }
}
