package Strings;

public class EasyString {
    public static String transform(String S){
        String ans = "";
        S = S.toLowerCase();
        int i = 0, j = 0;
        while(j<S.length()){
            if(S.charAt(i) == S.charAt(j)) j++;
            else{
                int count = j - i;
                ans += Integer.toString(count) + S.charAt(i);
                i = j;
            }
        }
        int count = j - i;
        ans += Integer.toString(count) + S.charAt(i);
        j = i;
        return ans;
    }

    public static void main(String[] args) {
        String S = "aaABBb";
        System.out.println(transform(S));
    }
}
