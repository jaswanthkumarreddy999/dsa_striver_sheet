package pattern_java;

import java.util.Scanner;

public class pattern18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // for(int i=n;i>=1;i--) {
        //     for(int j=i;j<=n;j++) {
        //         System.out.print((char)(j+64));
        //     }
        //     System.out.println();
        // }
        
        for(int i=1;i<=n;i++) {
            for(int j=n-i+1;j<=n;j++) {
                System.out.print((char)(j+64));
            }
            System.out.println();
        }





        // char a = (char)(n+64);
        // a++;
        // for(int i=1;i<=n;i++) {
        //     a--;
        //     char b = a;
        //     for(int j=1;j<=i;j++) {
        //         System.out.print(b++);
        //     }
        //     System.out.println();
        // }
        
        
    }
}