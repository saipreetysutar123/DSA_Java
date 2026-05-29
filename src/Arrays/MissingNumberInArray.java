package Arrays;

public class MissingNumberInArray {
    public static int missingNumber(int[] arr){
        int n = arr.length+1;
        int sumOfArr=0, sumOneToN;
        for(int i=0; i<n-1; i++){
            sumOfArr += arr[i];
        }
        sumOneToN = n*(n+1)/2;
        int missingNum = sumOneToN - sumOfArr;
        return missingNum;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        System.out.print("The missing number in the array is: " + missingNumber(arr));
    }
}