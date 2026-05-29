package Arrays;

public class WaveArray {
    public static void waveArray(int[] arr){
        int i=0, n=arr.length;
        while(i<n){
            if(i==n-1) break;
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
            i += 2;
        }
        for(int ele: arr){
            System.out.print(ele + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        waveArray(arr);
    }
}
