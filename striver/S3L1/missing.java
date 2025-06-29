package S3L1;

public class missing {
    public int missingNumber1(int[] nums) {
        int num = nums.length;
        int expected_sum = (num*(num+1))/2;
        int actual_sum=0;
        for(int i=0;i<num;i++)
            actual_sum+=nums[i];
        return expected_sum-actual_sum;
    }
    public int missingNumber2(int[] nums) {
        int ans = 0;
        for(int i=0;i<=nums.length;i++){
            ans^=i;
        }
        for(int i=0;i<nums.length;i++){
            ans^=nums[i];
        }
        return ans;
    }
}
