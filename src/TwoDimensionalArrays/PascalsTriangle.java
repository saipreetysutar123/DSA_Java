package TwoDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public static List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        //System.out.println(ans);
        for (int i = 0; i < n; i++) {
            ans.add(new ArrayList<>());
            //System.out.println(ans);
//            System.out.println();
            for (int j = 0; j <= i; j++) {
                if(j==0 || j==i) {
                    ans.get(i).add(1); // arr[i][j]=1
                    //System.out.println(ans);
                }
                else {
                    int val = ans.get(i-1).get(j)+ans.get(i-1).get(j-1);  //arr[i-1][j]+arr[i-1][j-1]
                    ans.get(i).add(val);
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
    }
}
