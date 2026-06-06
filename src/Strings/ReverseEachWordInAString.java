package Strings;

public class ReverseEachWordInAString {

    public static String reverse(String s){
        char[] arr = s.toCharArray();
        int i = 0, j=s.length()-1;
        while(i<j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }

    public static String reverseWords(String s){
        s = s.trim().replaceAll("\\s+", " ");
        StringBuilder ans = new StringBuilder();
        int i = 0, j = 0;
        while(j < s.length()){
            if(s.charAt(j) == ' '){
                String part = s.substring(i, j);
                String rev = reverse(part);
                ans.append(rev).append(" ");
                j++;
                i = j;
            }
            else j++;
        }
        String last = s.substring(i,j);
        last = reverse(last);
        ans.append(last);
        return ans.toString();
    }

    public static void main(String[] args) {
        String s = " i like this   program very much  ";
        System.out.println("Reversed string will be: " + reverseWords(s));
    }
}
