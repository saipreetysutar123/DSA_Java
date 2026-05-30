package Strings;

public class PalindromeString {
    public static boolean isPalindrome(String s){
        int i = 0, j = s.length() - 1;
        String s1 = s.toLowerCase();
        while(i<=j){
            if(s1.charAt(i) != s1.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "Katak";
        if(isPalindrome(s)) System.out.println(s + " is palindrome");
        else System.out.println(s + " not a palindrome");
    }
}
