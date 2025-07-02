package S3L1;

import java.util.HashMap;
import java.util.Scanner;

public class lsum {
    public static void main(String[] args) {
        int[] nums = {2,3,5,1,9};
        int k = 10;
        System.out.println(lsa2(nums,k));  
    }
    public static int  lsa1(int[] nums,int k){
        int ml=0;
        for(int i=0;i<nums.length;i++){
            int sum =0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum==k){
                    ml=Math.max(ml,j-i+1);
                }
            }
        }
        return ml;
    }
    public static int  lsa2(int[] nums,int k){
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,-1);
        int ml=0;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            hm.put(sum,i);
            if(hm.containsKey(sum-k)){
                ml = Math.max(i-hm.get(sum-k),ml);
            }     
        }
        return ml;
    }
   
}
