package S2L1;

import java.util.Scanner;

public class insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        is(arr);
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
    public static void is(int[] arr){
        for(int i=0;i<arr.length;i++){
            int j=i;
            while(j>=1 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
}
