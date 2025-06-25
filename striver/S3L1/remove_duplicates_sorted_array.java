package S3L1;

public class remove_duplicates_sorted_array {
    public int removeDuplicates(int[] nums) {
        int fr = 0;
        int sr = 0;
        while(fr<nums.length){
            if(nums[sr] != nums[fr]) {
                nums[++sr] = nums[fr];
            }
            fr++;
        }
        return ++sr;
    }
}
