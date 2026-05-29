package If_Else;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of rectangle: ");
        int l = sc.nextInt();
        System.out.println("Enter Breadth of rectangle: ");
        int b = sc.nextInt();
        int area = l*b;
        int perimeter = 2*(l+b);
        if(area > perimeter) System.out.println("Area is greater than perimeter");
        else System.out.println("Perimeter is greater than area");
    }
}
