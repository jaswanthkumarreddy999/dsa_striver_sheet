import java.util.Scanner;

public class pattern13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pin = 1;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(pin+++" ");
            }
            System.out.println();
        }
        
    }
}