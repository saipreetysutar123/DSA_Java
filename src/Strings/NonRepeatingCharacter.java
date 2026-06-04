package Strings;
import java.util.Arrays;

public class NonRepeatingCharacter {
    public static char nonRepeatingChar(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int idx = ch - 'a';
            freq[idx]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if(freq[s.charAt(i) - 'a'] == 1){
                return s.charAt(i);
            }
        }
        return '$';
    }

    public static void main(String[] args) {
        String s = "geeksffoorgeeks";
        System.out.println("Non repeating character is: " + nonRepeatingChar(s));
    }
}
