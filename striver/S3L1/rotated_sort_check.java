package S3L1;

public class rotated_sort_check {
    public boolean check(int[] arr) {
        int count=0;
        int pin = 0;
        for(int i=0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]) {
                    pin = i;
                    count++;
                }
            }   
        if(count==0)return true;
        if(count==1) {
            for(int i=pin+1;i<pin+arr.length;i++){
                if(arr[i%arr.length]>arr[(i+1)%arr.length]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
