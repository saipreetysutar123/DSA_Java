package ArrayList;

import java.util.ArrayList;

public class ArrayListInJavaBasic {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(23);
        arr.add(18);
        arr.add(14);
        arr.add(7);
        System.out.println(arr.get(0));
        arr.set(2,50);
    }
}
