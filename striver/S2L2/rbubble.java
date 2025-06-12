import java.util.Scanner;

public class rbubble{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        rbs(arr,n);
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
    public static void rbs(int[] arr,int n){
        if(n==1)return;
        for(int j=0;j<=n-2;j++){
            if(arr[j]>=arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        
        rbs(arr,n-1);
    }
}
