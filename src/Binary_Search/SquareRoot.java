package Binary_Search;

public class SquareRoot {
    public static int mySqrt(int n){
        long lo=0, hi=n;
        while(lo<=hi){
            long mid = lo+(hi-lo)/2;
            if(mid*mid == n) return (int) mid;
            if(mid*mid > n) hi = mid - 1;
            else lo = mid + 1;
        }
        return (int) hi;
    }

    public static void main(String[] args){
        int n=11;
        System.out.println("Floor of square root of " + n + " is: " + mySqrt(n));
    }
}
