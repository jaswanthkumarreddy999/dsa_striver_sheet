package pattern;

import java.util.Scanner;

public class pattern15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // for(int i=n;i>=1;i--) {
        //     for(int j=1;j<=i;j++) {
        //         System.out.print((char)(j+64));
        //     }
        //     System.out.println();
        // }

        for(int i=n;i>=1;i--) {
            char a = 'A';
            for(int j=1;j<=i;j++) {
                System.out.print(a++);
            }
            System.out.println();
        }
        
        
    }
}