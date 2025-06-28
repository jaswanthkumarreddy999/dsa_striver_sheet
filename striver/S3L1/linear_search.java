package S3L1;

import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int key = sc.nextInt();
        linearSearch(arr,key);
    }
    public static void linearSearch(int[] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(key==arr[i]){
                System.out.println("element is found at index "+i);
                return;
            }
        }
        System.out.println("element is not found in the array");
    }
}
