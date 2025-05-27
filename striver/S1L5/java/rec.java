package S1L5.java;
import java.util.Scanner;

public class rec{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(recfun(0,n));
    }
    public static String recfun(int i,int n){
        System.out.println(i);
        if(i==n) {
            return "hi"+i;
        }
        return recfun(++i,n);
    }
}