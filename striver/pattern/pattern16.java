package pattern;

import java.util.Scanner;

public class pattern16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // for(int i=1;i<=n;i++) {
        //     for(int j=1;j<=i;j++) {
        //         System.out.print((char)(i+64));
        //     }
        //     System.out.println();
        // }
        char a = 'A';
        a--;
        for(int i=n;i>=1;i--) {
            a++;
            for(int j=1;j<=i;j++) {
                System.out.print(a);
            }
            System.out.println();
        }
        
        
    }
}