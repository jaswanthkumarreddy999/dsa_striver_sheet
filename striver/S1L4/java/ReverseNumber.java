import java.util.Scanner;

public class ReverseNumber {
    public static int reverseNumber(int num) {
        int reversedNum = 0;
        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return reversedNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Reverse of " + num + " is: " + reverseNumber(num));
        sc.close();
    }
} 