package S3L1;

import java.util.Scanner;

public class largest_element_in_a_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
            arr[i] = sc.nextInt();
        System.out.println(le(arr));
    }
    public static int le(int[] arr){
        int max = arr[0];
        for(int i=1;i<arr.length;i++)
            if(max<arr[i])
                max = arr[i];
        return max;
    }
}
