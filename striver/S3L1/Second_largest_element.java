package S3L1;

import java.util.Scanner;

public class Second_largest_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sle(arr);
    }
    public static void sle(int[] arr){
        int m1 = arr[0];
        int m2 = arr[0];
        for(int i = 1;i<arr.length;i++){
            if (arr[i] > m1 ){
                m2 = m1;
                m1 = arr[i];
            }
            else if(arr[i]>m2){
                m2 = arr[i];
            }
        }
        System.out.println("highest elemnt is "+m1+" second highest element is "+m2);
    }
}
