package Strings;

public class CompareToMethod {
    public static int compareTo(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        int n = Math.min(a.length(), b.length());
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return a.charAt(i) - b.charAt(i);
            }
        }
        return a.length() - b.length();
    }
    public static void main(String[] args) {
        String a = "raghav";
        String b = "preet";
        System.out.println(compareTo(a,b));
        System.out.println(a.compareTo(b));
    }
}
