package S3L1;

import java.util.Scanner;

public class sort_check{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(); 
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        if(check(arr))
            System.out.print("Array is Sorted");
        else
            System.out.print("Array is not sorted");
    }
    public static boolean check(int[] arr){
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1])
                    return false;
            }   
            return true;
    }
}