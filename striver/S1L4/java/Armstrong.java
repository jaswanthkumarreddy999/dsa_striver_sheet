import java.util.Scanner;

public class Armstrong {
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int numDigits = String.valueOf(num).length();
        int sumOfPowers = 0;
        
        while (num > 0) {
            int digit = num % 10;
            sumOfPowers += Math.pow(digit, numDigits);
            num /= 10;
        }
        
        return sumOfPowers == originalNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
        sc.close();
    }
} 