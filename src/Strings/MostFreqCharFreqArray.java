package Strings;

public class MostFreqCharFreqArray {
    public static char mostFreqChar(String s){
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int idx = ch - 'a';
            freq[idx]++;
        }
        int maxFreq = -1;
        char ans = s.charAt(0);
        for (int i = 0; i < 26; i++) {
            if(freq[i] > maxFreq){
                maxFreq = freq[i];
                ans = (char)(i + 97);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "character";
        System.out.println("Most frequent character is: " + mostFreqChar(s));
    }
}
