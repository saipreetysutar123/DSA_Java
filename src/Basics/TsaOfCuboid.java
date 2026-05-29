package Basics;

public class TsaOfCuboid {
    public static void main(String[] args) {
        int l = 4, b = 6, h = 8;
        int tsa = 2*(l*b + b*h + l*h);
        System.out.println(tsa);
    }
}
