package Strings;
import java.util.Arrays;
public class MostFreqChar {
    public static char mostFreq(String s){
        int maxFreq = -1;
        char ans = s.charAt(0);
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int i = 0, j = 0;
        while(j<arr.length){
            if(arr[i] == arr[j]) j++;
            else{
                int freq = j - i;
                if(freq>maxFreq){
                    maxFreq = freq;
                    ans = arr[i];
                }
                i = j;
            }
        }
        int freq = j - i;
        if(freq>maxFreq){
            maxFreq = freq;
            ans = arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "characttter";
        System.out.println("Most frequent character: " + mostFreq(s));
    }
}
