import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Divisors {
    public static ArrayList<Integer> printDivisors(int num) {
        ArrayList<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                divisors.add(i);
                if (i != num / i) {  // Avoid duplicate for perfect squares
                    divisors.add(num / i);
                }
            }
        }
        Collections.sort(divisors);
        return divisors;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        ArrayList<Integer> divisors = printDivisors(num);
        System.out.println("Divisors of " + num + " are: " + divisors);
        sc.close();
    }
} 