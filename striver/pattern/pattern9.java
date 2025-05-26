package pattern;

import java.util.Scanner;

public class pattern9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++) {
            for(int j=n-i;j>=1;j--) {
                System.out.print(" ");
            }
            for(int k=(2*i)-1;k>=1;k--) {
                System.out.print("*");
            }
            System.out.println();
        }

        //System.out.println("<------------------------->");

        for(int i=n;i>=1;i--) {
            for(int j=0;j<n-i;j++) {
                System.out.print(" ");
            }
            for(int k=0;k<(2*i)-1;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}