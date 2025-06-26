package S3L1;

public class rotate_array_k_places {
    public void rotate1(int[] nums, int k) {
        for(int j=0;j<k;j++){
            int temp = nums[nums.length-1];
            for(int i=nums.length-2;i>=0;i--){
                nums[i+1]=nums[i];
            }
            nums[0]=temp;
        }
    }
    public void rotate2(int[] arr, int k) {
        int size = arr.length;
        k=k%size;
        int l = 0,r=size-1;
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        l=0;
        r=k-1;
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        l=k;
        r=size-1;
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
    public void rotate3(int[] arr, int k) {
    int size = arr.length;
    k=k%size;
    reverse(arr,0,size-1);
    reverse(arr,0,k-1);
    reverse(arr,k,size-1); 
    }
    public static void reverse(int[] arr,int l,int r){
        while(l<r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}

