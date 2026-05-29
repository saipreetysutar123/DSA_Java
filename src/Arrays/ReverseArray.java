package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {6, 8, 1, 2, 4, 9, 10};
        //int i=0, j=arr.length-1;
        int temp;
        int n = arr.length;
        // using two variable
//        while(i<j){
//            temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            i++;
//            j--;
//        }
//        for (int k = 0; k < arr.length; k++) {
//            System.out.print(arr[k] + " ");
//        }

        // using one variable
        for (int i = 0; i < n/2; i++) {
            temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        for (int k = 0; k < arr.length; k++) {
           System.out.print(arr[k] + " ");
       }
    }
}
