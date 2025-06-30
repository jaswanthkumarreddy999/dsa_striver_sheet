package S3L1;

public class appear_once {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int num:nums)
            res^=num;
        return res;
    }
}
