package Recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public static void main(String[] args) {
        ArrayList<String> ans = new ArrayList<>();
        generate(3, 0, 0, "", ans);
        System.out.println(ans);
    }
    public static void generate(int n, int l, int r, String s, List<String> ans){
        if(r == n) ans.add(s);
        if(l < n) generate(n, l+1, r, s+"(", ans);
        if(r < l) generate(n, l, r+1, s+")", ans);
    }
}
