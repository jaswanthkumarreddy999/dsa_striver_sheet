// import java.util.Scanner;

// public class pattern22{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1;i<=2*n-1;i++) {
//             for(int j=1;j<=2*n-1;j++) {
//                 if(i<=n && j<=n) {

//                     if(i<=j)System.out.print(n-i+1);
//                     else System.out.print(n-j+1);

//                 }else if(i<=n & j>n) {

//                     if(i+j <= 2*n)System.out.print(n-i+1);
//                     else System.out.print(j-n+1); 

//                 }else if(i>n && j<=n) {
//                     if(i+j <= 2*n)System.out.print(n-j+1);
//                     else System.out.print(i-n+1);
//                 } else {
//                     if(i<=j)System.out.print(j-n+1);
//                     else System.out.print(i-n+1);
//                 }

//             }
//             System.out.println();
//         }

//     }
// }

// import java.util.Scanner;

// public class pattern22{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int size = 2*n-1;
//         int[][] arr = new int[size][size];
//         for(int k=1;k<=n;k++) { //number filled
//             for(int i=k-1;i<=size-k;i++) {
//                 for(int j=k-1;j<=size-k;j++) {
//                     arr[i][j]=(n+1)-k;
//                 }
//             }
//         }
//         for(int i=0;i<size;i++) {
//             for(int j=0;j<size;j++) {
//                 System.out.print(arr[i][j]);
//             }
//             System.out.println();
//         }
//     }
// }

import java.util.Scanner;

public class pattern22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size = 2 * n - 1;
        int[][] arr = new int[size][size];
        int l = 0, r = size - 1, t = 0, b = size - 1, count = n;
        while (l != r && t != b) {
            for (int i = l; i <= r; i++)
                arr[t][i] = count;
            t++;
            for (int i = t; i <= b; i++)
                arr[i][r] = count;
            r--;
            for (int i = r; i >= l; i--)
                arr[b][i] = count;
            b--;
            for (int i = b; i >= t; i--)
                arr[i][l] = count;
            l++;
            count--;
        }
        arr[t][l]=1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}