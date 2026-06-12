package TwoDimensionalArrays;

import java.util.ArrayList;

public class Lists {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1); a.add(3); a.add(7); a.add(2);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(0); b.add(7); b.add(5); b.add(9);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(13); c.add(32); c.add(71); c.add(22);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(a); arr.add(b); arr.add(c);
       // System.out.println(arr);

//        for (int i = 0; i < arr.size(); i++) {
//            for (int j = 0; j < arr.get(i).size(); j++) {
//                System.out.print(arr.get(i).get(j)+" ");
//            }
//            System.out.println();
//        }
        for (ArrayList<Integer> list : arr){
            for (int ele : list){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
