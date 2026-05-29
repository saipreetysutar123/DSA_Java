package If_Else;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x point: ");
        int x = sc.nextInt();
        System.out.print("Enter y point: ");
        int y = sc.nextInt();
        if(x==0 && y==0) System.out.println("Origin");
        else if(x>0 && y>0) System.out.println("1st Quadrant");
        else if(x<0 && y>0) System.out.println("2nd Quadrant");
        else if(x<0 && y<0) System.out.println("3rd Quadrant");
        else if(x>0 && y<0) System.out.println("4th Quadrant");
        else if(x==0) System.out.println("y-axis");
        else System.out.println("x-axis");
    }
}
