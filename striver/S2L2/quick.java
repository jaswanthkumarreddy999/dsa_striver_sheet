package S2L2;

import java.util.Scanner;

public class quick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        qs(arr,0,n-1);
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
    public static void qs(int[] arr,int l,int r){
        if(l<r){
        int pi = fixedpoint(arr,l,r);
        qs(arr,l,pi-1);
        qs(arr,pi+1,r);
        } 
    }
    // public static int fixedpoint(int[] arr,int l,int r){
    //     int[] narr = new int[arr.length];
    //     int temp = arr[l];
    //     int lp = l,rp = r;
    //     for(int i=l+1;i<=r;i++){
    //         if(arr[i]<=temp){
    //             narr[lp]=arr[i];
    //             lp++;
    //         } else {
    //             narr[rp]=arr[i];
    //             rp--;
    //         }
    //     }
    //     narr[lp]=temp;
    //     for(int i=l;i<=r;i++){
    //         arr[i]=narr[i];
    //     }
    //     return lp;
    // }
    public static int fixedpoint(int[] arr,int l,int r){
        int temp = arr[l];
        int lp = l+1;
        int rp = r;
        while(lp<rp){
            while(lp<rp && temp>=arr[lp])lp++;
            while(temp < arr[rp])rp--;
            if(lp<rp){
                int t = arr[lp];
                arr[lp] = arr[rp];
                arr[rp] =t;
            }
        }
        arr[l] = arr[rp];
        arr[rp] = temp;
        return rp;
    }
}
