import java.util.*;
public class TwoNights {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            long totalPairs = (long)i * i * (i * i - 1) / 2;
            long attackingPairs = 0;
            if (i > 2)
                attackingPairs = 4L * (i - 1) * (i - 2);
            System.out.println(totalPairs - attackingPairs);
        }
    }
}
