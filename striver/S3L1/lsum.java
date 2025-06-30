package S3L1;

import java.util.Scanner;

public class lsum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }
        int rsum = sc.nextInt();
        System.out.println(lsa(nums,rsum));
    }
    public static int lsa(int[] nums,int rsum){
        int lp = 0;
        int rp = 0;
        int sum = 0;
        while(rp<nums.length && lp<nums.length){
            if(sum<rsum){
                sum+=nums[rp];
                System.out.println(lp+" "+rp+" "+sum);
                rp++;
            } else if (sum==rsum) {
                System.out.println("Found the answer "+(rp-lp));
                sum+=nums[rp];
                rp++;
            } else{
                sum-=nums[lp];
                lp++;
            }

        }
        return 0;
    }
}
