package Binary_Search;

public class ArrangingCoins {
    public static int arrangeCoins(int n){
        return (int)((Math.sqrt(8*n+1)) - 1)/2;
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println("k: " + arrangeCoins(n));
    }
}
