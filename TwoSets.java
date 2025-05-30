import java.util.*;
public class TwoSets {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 1L * n * (n + 1) / 2;
        if ((sum & 1) == 1) {
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
        long target = sum / 2L;
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int c1 = 0, c2 = 0;
        for (long i = n; i >= 1; i--) {
            if (target >= i) {
                sb1.append(i).append(' ');
                target -= i;
                c1++;
            } else {
                sb2.append(i).append(' ');
                c2++;
            }
        }
        System.out.println(c1);
        System.out.println(sb1.toString().trim());
        System.out.println(c2);
        System.out.println(sb2.toString().trim());
    }
}
