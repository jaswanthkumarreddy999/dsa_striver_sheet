package S1L4;

import java.util.Scanner;

public class countdigits {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     String num = sc.nextLine();
    //     System.out.println(num.length());
    // }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digit=0;
        while (num!=0) {
            digit++;
            num/=10;
        }
        System.out.print(digit);
    }
}
