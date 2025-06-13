import java.util.Scanner;

public class ri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        ris(arr,1);
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
    public static void ris(int[] arr,int i) {
        if(i == arr.length)return;
        int val = arr[i];
        int j = i;
        while(j>=1 && arr[j-1]>=val){
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
            j--;
        }
        ris(arr,i+1);
    }
}
