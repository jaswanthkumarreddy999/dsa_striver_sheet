package S2L1;

import java.util.Scanner;

public class selection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        ss(arr);
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
    public static void ss(int[] arr){
        for(int i=0;i<arr.length;i++){
            int point = 0;
            for(int j=0;j<arr.length-i;j++){
                if(arr[point]<arr[j])
                    point = j;
            }
            int temp = arr[point];
            arr[point] = arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
    }
}
