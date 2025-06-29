package S3L1;

import java.util.HashSet;
import java.util.Scanner;

public class union {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int size1 = sc.nextInt();
    //     int[] larr = new int[size1];
    //     for(int i=0;i<size1;i++){
    //         larr[i]=sc.nextInt();
    //     }
    //     int size2 = sc.nextInt();
    //     int[] rarr = new int[size2];
    //     for(int i=0;i<size2;i++){
    //         rarr[i]=sc.nextInt();
    //     }
    //     int[] result = merge(larr,rarr);
    //     int size = removeDuplicates(result);
    //     for(int i=0;i<size;i++){
    //         System.out.print(result[i]+" ");
    //     }
    // }
    // public static int[] merge(int[] larr,int[] rarr){
    //     int[] result = new int[larr.length+rarr.length];
    //     int k =0;
    //     int l =0;
    //     int r = 0;
    //     while(l<larr.length && r<rarr.length){
    //         if(larr[l]>=rarr[r]){
    //             result[k]=rarr[r];
    //             k++;
    //             r++;
    //         }else {
    //             result[k]=larr[l];
    //             k++;
    //             l++;
    //         }
    //     }
    //     while(l<larr.length){
    //         result[k]=larr[l];
    //         k++;
    //         l++;
    //     }
    //     while(r<rarr.length){
    //         result[k]=rarr[r];
    //         k++;
    //         r++;
    //     }
    //     return result;
    // }
    // public static int removeDuplicates(int[] nums) {
    //     int fr = 0;
    //     int sr = 0;
    //     while(fr<nums.length){
    //         if(nums[sr] != nums[fr]) {
    //             nums[++sr] = nums[fr];
    //         }
    //         fr++;
    //     }
    //     return ++sr;
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int[] larr = new int[size1];
        for(int i=0;i<size1;i++){
            larr[i]=sc.nextInt();
        }
        int size2 = sc.nextInt();
        int[] rarr = new int[size2];
        for(int i=0;i<size2;i++){
            rarr[i]=sc.nextInt();
        }
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<size1;i++){
            hs.add(larr[i]);
        }
        for(int i=0;i<size2;i++){
            hs.add(rarr[i]);
        }
        System.out.println(hs);
    }
}
