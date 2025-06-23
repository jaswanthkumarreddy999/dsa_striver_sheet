import java.util.Scanner;

public class removeduplicates {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(); 
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(removeDuplicates(arr));
        System.out.println();
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int removeDuplicates(int[] nums) {
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
