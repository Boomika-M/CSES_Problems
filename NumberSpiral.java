import java.io.*;
import java.util.*;

public class NumberSpiral {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String[] input = br.readLine().trim().split(" ");
            long x = Long.parseLong(input[0]);
            long y = Long.parseLong(input[1]);
            long ans = 0;

            if (x >= y) {
                if (x % 2 == 0) {
                    ans = x * x - (y - 1);
                } else {
                    ans = (x - 1) * (x - 1) + 1 + (y - 1);
                }
            } else {
                if (y % 2 == 1) {
                    ans = y * y - (x - 1);
                } else {
                    ans = (y - 1) * (y - 1) + 1 + (x - 1);
                }
            }

            sb.append(ans).append("\n");
        }

        System.out.print(sb);
    }
}
