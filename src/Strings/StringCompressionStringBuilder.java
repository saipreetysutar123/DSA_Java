package Strings;

public class StringCompressionStringBuilder {
    public static int compress(char[] chars){
        StringBuilder ans = new StringBuilder("");
        int i=0, j=0;
        while(j<chars.length){
            if(chars[i] == chars[j]) j++;
            else{
                int freq = j - i;
                ans.append(chars[i]);
                if(freq > 1) ans.append(freq);
                i = j;
            }
        }
        int freq = j - i;
        ans.append(chars[i]);
        if(freq > 1) ans.append(freq);
        i = j;
        System.out.println(ans);
        return ans.length();
    }

    public static void main(String[] args) {
        char[] chars = {'a'};
        System.out.println(compress(chars));
    }
}
