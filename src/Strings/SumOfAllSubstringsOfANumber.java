package Strings;

public class SumOfAllSubstringsOfANumber {
    public static int sumSubstrings(String s){
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String str = s.substring(i, j+1);
                sum += Integer.parseInt(str);
            }
            System.out.println();
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Sum of string is: " + sumSubstrings("5"));
    }
}
