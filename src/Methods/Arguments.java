package Methods;

public class Arguments {

    public static int print(int a){
        if(a < 5){
            return 5;
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println(print(3));
    }
}
