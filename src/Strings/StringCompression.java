package Strings;

public class StringCompression {
    public static int compress(char[] chars){
        int i=0, j=0;
        int write = 0;
        while(j<chars.length){
            if(chars[i] == chars[j]) j++;
            else{
                int freq = j - i;
                chars[write++] = chars[i];
                if(freq > 1){
                    String count = String.valueOf(freq);
                    for(char ch : count.toCharArray()){
                        chars[write++] = ch;
                    }
                }
                i = j;
            }
        }
        int freq = j - i;
        chars[write++] = chars[i];
        if(freq > 1){
            String count = String.valueOf(freq);
            for(char ch : count.toCharArray()){
                chars[write++] = ch;
            }
        }
        i = j;
        return write;
    }

    public static void main(String[] args) {
        char[] chars = {'a'};
        System.out.println(compress(chars));
    }
}
