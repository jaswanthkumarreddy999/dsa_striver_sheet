package S3L1;

public class sort_0_1_2 {
    public void sortColors(int[] nums) {
        int c0 = 0;
        int c1 = 0;
        int c2 = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)c0++;
            else if(nums[i]==1)c1++;
            else c2++;
        }
        int i=0;
        while(c0 != 0){
            nums[i++]=0;
            c0--;
        }
        while(c1 != 0){
            nums[i++]=1;
            c1--;
        }
        while(c2 != 0){
            nums[i++]=2;
            c2--;
        }
    }
    public void sortColors(int[] nums) {
      int low = 0;
      int mid = 0;
      int high = nums.length-1;
      while(mid <= high){
        if(nums[mid] == 0) {
            int temp = nums[low];
            nums[low] = nums[mid];
            nums[mid] = temp;
            low++;
            mid++;
        } else if(nums[mid] == 1){
            mid++;
        }else {
            int temp = nums[high];
            nums[high] = nums[mid];
            nums[mid] = temp;
            high--;
        }
      }
    }
}