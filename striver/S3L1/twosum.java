package S3L1;

import java.util.HashMap;

public class twosum {
    class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int key = target - nums[i];
            if(hm.containsKey(key)){
                return new int[] {hm.get(key),i};
            }
            hm.put(nums[i],i);
        }
        return new int[] {};
    }
}
}
