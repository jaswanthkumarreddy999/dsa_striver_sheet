package S3L1;

public class move_zeros_to_end{
    public void moveZeroes(int[] nums) {
        int sr=0;
        for(int fr = 0;fr<nums.length;fr++){
            if(nums[fr]!=0){
                nums[sr++]=nums[fr];
            }
        }
        while(sr<nums.length){
            nums[sr++] = 0;
        }
    }
}