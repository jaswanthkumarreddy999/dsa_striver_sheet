package S3L1;

public class max_staright_ones {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int mc=0;
        for(int num:nums){
            if(num==1){
                c++;
            }else {
                mc = Math.max(mc,c);
                c=0;
            }
        }
        mc = Math.max(mc,c);
        return mc;
    }
}
