package Arrays;

public class MergeReverse {
    public static void mergeInReverse(int[] a, int[] b){
        int n=a.length;
        int m=b.length;
        int[] c = new int[n+m];
        int i=n-1, j=m-1, k=c.length-1;
        while(i>=0 && j>=0){
            if(a[i]>=b[j]) c[k--] = a[i--];
            else c[k--] = b[j--];
        }
        while(i>=0) c[k--] = a[i--];
        while(j>=0) c[k--] = b[j--];
        for(int ele : c){
            System.out.print(ele + " ");
        }
    }
    public static void main(String[] args) {
        int[] a = {2, 5, 6, 9, 20};
        int[] b = {1, 3, 4, 5, 10, 11};
        mergeInReverse(a, b);
    }
}
