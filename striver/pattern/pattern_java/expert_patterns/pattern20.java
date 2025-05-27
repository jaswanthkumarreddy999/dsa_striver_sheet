import java.util.Scanner;

public class pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for(int k = 1;k<=(n-i)*2;k++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= i; m++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 2; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            for(int k = 3;k<=i*2;k++) {
                System.out.print(" ");
            }
            for (int m = n; m >= i; m--) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
