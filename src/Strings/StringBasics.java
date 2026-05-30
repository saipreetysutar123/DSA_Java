package Strings;

import java.util.Scanner;

public class StringBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter name: ");
//        String str = sc.next();
//        System.out.println(str);
        System.out.print("Enter name: ");
        String str1 = sc.nextLine();
        System.out.println(str1);
        System.out.println(str1.charAt(3));
        System.out.print(str1.length());
    }
}