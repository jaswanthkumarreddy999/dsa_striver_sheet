package S1L5.java;

import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n = sc.nextInt();
        System.out.println(fact(n));
    }
    public static float fact(float n){
        if(n==1)
            return 1;
        System.out.println(n);
        return n*fact(n-1);
    }
}
