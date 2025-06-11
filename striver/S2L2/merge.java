package S2L2;

import java.util.Scanner;

public class merge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        arr = ms(arr,0,n-1);
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
    public static int[] ms(int[] arr,int l,int r){
        if(l==r){
            int[] unit = new int[1];
            unit[0] = arr[l];
            return unit;
        }
        int mid = (l+r)/2;
        int[] larr = ms(arr,l,mid);
        int[] rarr = ms(arr,mid+1,r);
        return merge(larr,rarr);
    }
    public static int[] merge(int[] larr,int[] rarr){
        int[] result = new int[larr.length+rarr.length];
        int k =0;
        int l =0;
        int r = 0;
        while(l<larr.length && r<rarr.length){
            if(larr[l]>=rarr[r]){
                result[k]=rarr[r];
                k++;
                r++;
            }else {
                result[k]=larr[l];
                k++;
                l++;
            }
        }
        while(l<larr.length){
            result[k]=larr[l];
            k++;
            l++;
        }
        while(r<rarr.length){
            result[k]=rarr[r];
            k++;
            r++;
        }
        return result;
    }
}
