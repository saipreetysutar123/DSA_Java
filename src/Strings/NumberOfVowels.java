package Strings;

public class NumberOfVowels {
    public static void main(String[] args) {
        String s = "Saipreety K Sutar";
        int vowels=0;
        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if(s.charAt(i) == 'a' ||
                    ch == 'e' ||
                    ch == 'i' ||
                    ch == 'o' ||
                    ch == 'u') vowels++;
        }
        System.out.println("Number of vowels: " + vowels);
    }
}
