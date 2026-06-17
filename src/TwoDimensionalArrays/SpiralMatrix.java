package TwoDimensionalArrays;

import java.util.ArrayList;

public class SpiralMatrix {
    public static ArrayList<Integer> spirallyTraverse(int[][] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length, m = arr[0].length;
        int fr = 0, lr = n-1, fc = 0, lc = m-1;
        while(fr<=lr && fc<=lc){
            // right
            for (int j = fc; j <= lc; j++) ans.add(arr[fr][j]);
                fr++;
            if(fr>lr || fc>lc) break;
            // down
            for (int i = fr; i <= lr; i++) ans.add(arr[i][lc]);
                lc--;
            if(fr>lr || fc>lc) break;
            // left
            for (int j = lc; j >= fc; j--) ans.add(arr[lr][j]);
                lr--;
            if(fr>lr || fc>lc) break;
            // up
            for (int i = lr; i >= fr; i--) ans.add(arr[i][fc]);
                fc++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5}, {6,7,8,9,10},{11, 12, 13, 14, 15},{16, 17, 18, 19, 20},{21, 22, 23, 24, 25}};
        System.out.println(spirallyTraverse(arr));
    }
}
