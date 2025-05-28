package S1L5.java;

import java.util.Scanner;

public class rev {
    public static void main(String[] args) {
        //       method1 == by using new array

        //Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int[] arr = new int[size];
        // for(int i=0;i<size;i++){
        //     arr[i] = sc.nextInt();
        // }
        // int[] revarr = new int[size];
        // for(int i=0;i<size;i++){
        //     revarr[i]=arr[size-i-1];
        // }
        // for(int i=0;i<size;i++){
        //     System.out.print(revarr[i]+" ");
        // }
        //

        //        method2 == two pointer approach
        
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int[] arr = new int[size];
        // for(int i=0;i<size;i++){
        //     arr[i] = sc.nextInt();
        // }
        // int l=0,r=size-1;
        // while(l<r){
        //     int temp = arr[r];
        //     arr[r] = arr[l];
        //     arr[l] = temp;
        //     l++;
        //     r--;
        // }
        // for(int i=0;i<size;i++){
        //     System.out.print(arr[i]+" ");
        // }

        //  method3 = recursiveapproach

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        revarr(arr,0,size-1);
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }


    }
    public static void revarr(int[] arr,int l,int r){
        if(l>=r) return;

        int temp = arr[r];
        arr[r] = arr[l];
        arr[l] = temp;
        
        revarr(arr, ++l, --r);
    }
}
