package Basics;

import java.util.Scanner;

public class SquareOfANumber {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
     int num = sc.nextInt();
     int sq = num * num;
        System.out.println("Square of the number is: " + sq);
    }
}
