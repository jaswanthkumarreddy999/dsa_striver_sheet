package S1L6;
import java.util.*;
public class hash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<size;i++){
            int num = sc.nextInt();
            hm.put(num,hm.getOrDefault(num,0)+1);
            System.out.println(hm);
        }
        int key = sc.nextInt();
        System.out.println(hm.get(key));
    }
}
