package Arrays;

public class Segregate0sAnd1s {
    public static void segregrate(int[] arr){
//        int numOfZeros = 0;
//        int numOfOnes = 0;
//        for(int ele : arr){
//            if(ele == 0) numOfZeros++;
//            else numOfOnes++;
//        }
//        int i=0, j=numOfZeros;
//        while(i<numOfZeros){
//            arr[i] = 0;
//            i++;
//        }
//        while(j< arr.length){
//            arr[j] = 1;
//            j++;
//        }
//        for(int ele : arr){
//            System.out.print(ele + " ");
//        }

        // using two pointer

        int n = arr.length;
        int i=0, j=n-1;
        while(i<j){
            if(arr[i]==0) i++;
            else if(arr[j]==1) j--;
            else if(i>j) break;
            else  if(arr[i]==1 && arr[j]==0){
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1, 0, 0};
        segregrate(arr);
    }
}
